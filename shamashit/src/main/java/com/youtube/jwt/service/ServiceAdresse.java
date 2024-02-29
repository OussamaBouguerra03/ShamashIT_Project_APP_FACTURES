package com.youtube.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.jwt.dao.AdresseRepository;
import com.youtube.jwt.entity.Adresse;
 
@Service
public class ServiceAdresse implements IServiceAdresse {
@Autowired
AdresseRepository AR;

 
 
@Override
public void SupprimerAdresse(int ID_ADR) {
AR.deleteById(ID_ADR);	
}

@Override
public List<Adresse> findAll() {
	List<Adresse> adr =(List<Adresse>)(AR.findAll());
	return adr;
}

@Override
public void AjouterAdresse(Adresse adresse) {
	AR.save(adresse);	
	
}

@Override
public void ModifierAdresse(Adresse adresse) {
	AR.save(adresse);	
	
}

}
