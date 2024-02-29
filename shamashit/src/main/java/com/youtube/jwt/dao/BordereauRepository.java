package com.youtube.jwt.dao;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.youtube.jwt.entity.Bordereau;
import com.youtube.jwt.entity.Contrat;

 @Repository
public interface BordereauRepository extends JpaRepository<Bordereau, Integer>
{
 @Query(value ="select * from T_BORDEREAU  where VALIDE_BORD=0 ", nativeQuery = true)
 
 Set<Bordereau>findValide();
    @Query(value ="select * from T_BORDEREAU  where VALIDE_BORD=1 ", nativeQuery = true)

    Set<Bordereau>findValides();
	 Bordereau findById(int voyageId);
	 void save(List<Bordereau> l);
	 @Query(value = "SELECT * FROM T_BORDEREAU ORDER BY NUM_BORD DESC LIMIT 1", nativeQuery = true)
 	    Bordereau findFirstByOrderByIdDesc();
	 @Query(value = " SELECT * FROM shamashit.t_bordereau c INNER JOIN shamashit.user u ON c.REF_ADH_BORD = u.user_name WHERE u.actif_user = 1 AND u.user_name =? ",nativeQuery = true)
     List<Bordereau> findbordForActiveUser(@Param("userName") String userName);
 
 }
 