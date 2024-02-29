package com.youtube.jwt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.youtube.jwt.entity.Financement;

 @Repository
public interface FinancementRepository 	extends JpaRepository<Financement, Integer>
{
	Financement findById(int FinancementId);

 
}
