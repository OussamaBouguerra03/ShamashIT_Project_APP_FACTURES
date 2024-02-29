package com.youtube.jwt.service;

import com.youtube.jwt.dao.RoleDao;
import com.youtube.jwt.dao.UserDao;
import com.youtube.jwt.entity.Role;
import com.youtube.jwt.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Mock
    private UserDao userDao;

    @Mock
    private RoleDao roleDao;

    @Mock
    private PasswordEncoder passwordEncoder;

    @Test
    public void testRegisterNewUser() {
        User newUser = new User();
        newUser.setUserName("newuser");
        newUser.setUserPassword("newpassword");
        newUser.setUserFirstName("John");
        newUser.setUserLastName("Doe");

        Role userRole = new Role();
        userRole.setRoleName("User");
        when(roleDao.findById("User")).thenReturn(Optional.of(userRole));

        when(passwordEncoder.encode("newpassword")).thenReturn("hashedPassword");

        when(userDao.save(newUser)).thenReturn(newUser);

        User savedUser = userService.registerNewUser(newUser);

        assertNotNull(savedUser);
        assertEquals("newuser", savedUser.getUserName());
        assertEquals("hashedPassword", savedUser.getUserPassword());
        assertEquals(1, savedUser.getRole().size());
        assertTrue(savedUser.getRole().contains(userRole));

        verify(roleDao, times(1)).findById("User");
        verify(passwordEncoder, times(1)).encode("newpassword");
        verify(userDao, times(1)).save(newUser);
    }

    @Test
    public void testGetEncodedPassword() {
        when(passwordEncoder.encode("password")).thenReturn("hashedPassword");

        String encodedPassword = userService.getEncodedPassword("password");

        assertEquals("hashedPassword", encodedPassword);

        verify(passwordEncoder, times(1)).encode("password");
    }
}
