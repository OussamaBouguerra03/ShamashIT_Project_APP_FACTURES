package com.youtube.jwt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 import com.youtube.jwt.dao.ContratRepository;
 import com.youtube.jwt.entity.Contrat;

 
@Service
public class ServiceContrat implements IServiceContrat {
@Autowired
ContratRepository CR;
  
	@Override
	public void ModifierContrat(Contrat contrat) {
CR.save(contrat);		
	}

	@Override
	public List<Contrat> findall() {
		List<Contrat> cont =(List<Contrat>)(CR.findAll());
		return cont;
	}

	@Override
	public void AjouterContrat(Contrat contrat) {
		// TODO Auto-generated method stub
		CR.save(contrat);
       
	}
 
}
