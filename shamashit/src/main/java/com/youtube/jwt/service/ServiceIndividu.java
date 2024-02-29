package com.youtube.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.jwt.dao.IndividuRepository;
import com.youtube.jwt.entity.Individus;
 
@Service
public class ServiceIndividu implements IServiceIndividu {
@Autowired
IndividuRepository IR;

 
@Override
public void SupprimerIndividu(int REF_IND) {
IR.deleteById(REF_IND);	
}

 

@Override
public List<Individus> findall() {
	List<Individus> indiv = (List<Individus>) (IR.findAll());
	return indiv;
}

@Override
public void AjouterIndividu(Individus individu) {
    if (IR.findByNUM_PIECE_IND(individu.getNUM_PIECE_IND()) != null) {
        throw new IndividuExistException("Individu avec ce numéro de pièce existe déjà");
    }
    if (IR.findByEMAIL_IND(individu.getEMAIL_IND()) != null) {
        throw new EmailExistException("Adresse e-mail existe déjà");
    }
    IR.save(individu);
}
public class IndividuExistException extends RuntimeException {
    public IndividuExistException(String message) {
        super(message);
    }
}
public class EmailExistException extends RuntimeException {
    public EmailExistException(String message) {
        super(message);
    }
}

@Override
public void ModifierIndividu(Individus individu) {
	IR.save(individu);	
	
}



 




}
