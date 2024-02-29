package com.youtube.jwt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.youtube.jwt.entity.Encaissement;

 
@Repository
public interface EncaissementRepository extends CrudRepository<Encaissement,Integer> {
	Encaissement findById(int EncaissementId);

	void save(int idEnc);
	 @Query(value = "SELECT * FROM T_ENCAISSEMENT WHERE REF_CTR_ENC=?", nativeQuery = true)

	List<Encaissement> findByRefCTRENC(int REF_CTR_ENC);
	

}
