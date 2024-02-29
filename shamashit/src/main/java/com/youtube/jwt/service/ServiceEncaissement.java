package com.youtube.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.jwt.dao.ContratRepository;
import com.youtube.jwt.dao.EncaissementRepository;
import com.youtube.jwt.entity.Encaissement;
import com.youtube.jwt.entity.Contrat;
 

@Service
public class ServiceEncaissement implements IServiceEncaissement {
@Autowired
EncaissementRepository EnR;
@Autowired
ContratRepository cr;

	@Override
	public void AjouterEncaissement(Encaissement encaissement) {
		EnR.save(encaissement);
	}

	@Override
	public void ModifierEncaissement(Encaissement encaissement) {
EnR.save(encaissement);		
	}

	@Override
	public List<Encaissement> findAll() {
		List<Encaissement> enc =(List<Encaissement>)(EnR.findAll());
		return enc;
	}

	public void updateEncaissementValide(int idEnc) {
		// TODO Auto-generated method stub
		EnR.save(idEnc);
	}

	public List<Encaissement> getEncaissementsByRefContrat(int refContrat) {
		// TODO Auto-generated method stub
	    return EnR.findByRefCTRENC(refContrat);
	}
	 
}
