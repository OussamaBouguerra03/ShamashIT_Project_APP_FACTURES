package com.youtube.jwt.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.youtube.jwt.entity.Bordereau;
import com.youtube.jwt.entity.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Integer> {
    Contrat findById(int ContratId);
    
    @Query(value="SELECT c.NOM_ADER, c.NOM_ACHE FROM T_CONTRAT c WHERE c.REF_CTR = REF_CTR", nativeQuery = true)
    Object[] findByRefCtr(@Param("refCtr") int refCtr);
 
    		@Query(value = " SELECT * FROM shamashit.t_contrat c INNER JOIN shamashit.user u ON c.nom_ader = u.user_name WHERE u.actif_user = 1 AND u.user_name =? ",nativeQuery = true)
     List<Contrat> findContratsForActiveUser(@Param("userName") String userName);
 
    }