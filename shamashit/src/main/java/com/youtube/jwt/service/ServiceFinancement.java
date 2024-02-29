package com.youtube.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.jwt.dao.DetBordRepository;
import com.youtube.jwt.dao.FinancementRepository;
import com.youtube.jwt.entity.Financement;
 
@Service
public class ServiceFinancement implements IServiceFinancement {
@Autowired
FinancementRepository FR;
@Autowired
DetBordRepository dt;
	@Override
	public void AjouterFinancement(Financement financement) {
FR.save(financement);		
	}

	@Override
	public void ModifierFinancement(Financement financement) {
FR.save(financement);		
	}

	@Override
	public List<Financement> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	 
 

}
