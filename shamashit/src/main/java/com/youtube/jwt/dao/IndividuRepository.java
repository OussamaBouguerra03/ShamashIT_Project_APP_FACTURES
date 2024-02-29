package com.youtube.jwt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.youtube.jwt.entity.Contrat;
import com.youtube.jwt.entity.Individus;

 
@Repository
public interface IndividuRepository extends JpaRepository<Individus, Integer> {
	Individus findById(int IndividuId);
	 @Query(value = "SELECT * FROM T_INDIVIDU WHERE NUM_PIECE_IND=?", nativeQuery = true)
	Object findByNUM_PIECE_IND(int num_PIECE_IND);
	 @Query(value = "SELECT * FROM T_INDIVIDU WHERE EMAIL_IND=?", nativeQuery = true)
	Object findByEMAIL_IND(String email_IND);
 
	 @Query(value = " SELECT * FROM shamashit.t_individu c INNER JOIN shamashit.user u ON c.login_ind = u.user_name WHERE u.actif_user = 1 AND u.user_name =? ",nativeQuery = true)
     List<Individus> findindivisuForActiveUser(@Param("userName") String userName);

}
