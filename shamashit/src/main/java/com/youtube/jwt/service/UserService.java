package com.youtube.jwt.service;

import com.youtube.jwt.dao.RoleDao;
import com.youtube.jwt.dao.UserDao;
import com.youtube.jwt.entity.Role;
import com.youtube.jwt.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
@Service
public class UserService implements UserDetailsService {
    @Autowired
    private JwtUtil jwtUtil;
    
    @Autowired
    private UserDao userDao;
    
    @Autowired
    private AuthenticationManager authenticationManager;
    
    private static final String USER_NOT_FOUND_MESSAGE = "User not found with username: ";

    public JwtResponse createJwtToken(JwtRequest jwtRequest) throws UsernameNotFoundException {
        String userName = jwtRequest.getUserName();
        

        UserDetails userDetails = loadUserByUsername(userName);
        
        if (userDetails != null) {
            String newGeneratedToken = jwtUtil.generateToken(userDetails);
            Optional<User> userOptional = userDao.findById(userName);
            User user = userOptional.orElseThrow(() -> new UsernameNotFoundException(USER_NOT_FOUND_MESSAGE + userName));
            
            return new JwtResponse(user, newGeneratedToken);
        } else {
            throw new UsernameNotFoundException(USER_NOT_FOUND_MESSAGE + userName);
        }
    }
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userOptional = userDao.findById(username);
        
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            
            return new org.springframework.security.core.userdetails.User(
                    user.getUserName(),
                    user.getUserPassword(),
                    getAuthorities(user)
            );
        } else {
            throw new UsernameNotFoundException(USER_NOT_FOUND_MESSAGE + username);
        }
    }
    
    private Set<SimpleGrantedAuthority> getAuthorities(User user) {
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        
        user.getRole().forEach(role -> authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getRoleName())));
        
        return authorities;
    }
}
