package com.youtube.jwt.dao;

import org.springframework.stereotype.Repository;

import com.youtube.jwt.entity.Adresse;
import com.youtube.jwt.entity.Contrat;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface AdresseRepository	extends JpaRepository<Adresse, Integer>
 {
	Adresse findById(int AdresseId);

	@Query(value = " SELECT * FROM shamashit.t_adresse c INNER JOIN shamashit.user u ON c.ref_ind_adr = u.user_name WHERE u.actif_user = 1 AND u.user_name =? ",nativeQuery = true)
List<Adresse> findadresseForActiveUser(@Param("userName") String userName);

}
