package com.youtube.jwt.dao;

import com.youtube.jwt.entity.User;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, String> {
	 @Query(value="SELECT * FROM user  WHERE actif_user = 1", nativeQuery = true)
	    User actifuser(@Param("actif_user") int actifuser);
 	User findByuserName(String userName);
 	@Query(value = "SELECT user_name FROM user WHERE actif_user = 1", nativeQuery = true)
 	List<String> getActiveUsernames();

}
