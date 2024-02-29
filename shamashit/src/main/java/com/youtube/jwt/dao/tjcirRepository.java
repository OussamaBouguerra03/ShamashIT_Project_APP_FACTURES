package com.youtube.jwt.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.youtube.jwt.entity.Contrat;
import com.youtube.jwt.entity.TJ_CIR;

public interface tjcirRepository extends CrudRepository<TJ_CIR,Integer>{
	
}
