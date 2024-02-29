package com.youtube.jwt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.youtube.jwt.entity.Contact;
 

@Repository
public interface ContactRepository 	extends JpaRepository<Contact, Integer>
{
	Contact findById(int ContactId);
	@Query(value = " SELECT * FROM shamashit.t_contact c INNER JOIN shamashit.user u ON c.ref_ind_contact = u.user_name WHERE u.actif_user = 1 AND u.user_name =? ",nativeQuery = true)

	List<Contact> findadresseForActiveUser(String userName);
	
 
}
