package com.youtube.jwt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

 import com.youtube.jwt.entity.TJ_LETTRAGE;
@Repository
public interface LettrageRepository extends CrudRepository<TJ_LETTRAGE,Integer> {
	
			 @Query(value = "SELECT  T_CONTRAT.REF_CTR, T_ENCAISSEMENT.REF_CTR_ENC FROM T_CONTRAT LEFT JOIN T_ENCAISSEMENT ON T_CONTRAT.REF_CTR = T_ENCAISSEMENT.REF_CTR_ENC WHERE   T_CONTRAT.REF_CTR =?", nativeQuery = true)
			 Object[] findFirstByOrderByIdDesc(@Param("refCtr") int refCtr);
			 @Query(value = "SELECT T_CONTRAT.* FROM T_CONTRAT WHERE T_CONTRAT.REF_CTR = ?", nativeQuery = true)
			 Object[] getContratsByRefCtr(int refCtr);
			 @Query(value = "DELETE  FROM TJ_LETTRAGE WHERE ID_DET_BORD_LET = 0", nativeQuery = true)
			void deleteByDetBordLetId(int i);
			 @Query(value = "SELECT *  FROM TJ_LETTRAGE", nativeQuery = true)

			List<TJ_LETTRAGE> findall();

  
}
