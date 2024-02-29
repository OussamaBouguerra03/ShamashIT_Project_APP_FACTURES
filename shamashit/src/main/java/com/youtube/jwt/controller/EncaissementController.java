package com.youtube.jwt.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.youtube.jwt.dao.BordereauRepository;
import com.youtube.jwt.dao.ContratRepository;
import com.youtube.jwt.dao.EncaissementRepository;
import com.youtube.jwt.entity.Contrat;
import com.youtube.jwt.entity.Encaissement;

import com.youtube.jwt.entity.Bordereau;
import com.youtube.jwt.service.ServiceEncaissement;

 
 
@RestController
public class EncaissementController {
@Autowired
ServiceEncaissement SE;
@Autowired
EncaissementRepository ER;
@Autowired
ContratRepository CR;
@Autowired
BordereauRepository BR;

@GetMapping("/f/{refContrat}")
public ResponseEntity<List<Encaissement>> getEncaissementsByRefContrat(@PathVariable("refContrat") int refContrat) {
  List<Encaissement> encaissements = SE.getEncaissementsByRefContrat(refContrat);
  return ResponseEntity.ok(encaissements);
}
 
@GetMapping("findbyref/{REF_CTR}")
private Object[] findByRefCtr(@PathVariable(value ="REF_CTR") int refCtr){
return CR.findByRefCtr(refCtr);	
}
@GetMapping("ConsulterEncaissement")
private List<Encaissement> getAllEncaissement()
{
return SE.findAll();	
}
@PutMapping("ModifierEncaissement/{id}")
public ResponseEntity<Encaissement> updateEncaissement(@PathVariable(value = "id") int EncaissementId,
		@Valid @RequestBody Encaissement EncaissementDetails) {
	Encaissement enc = ER.findById(EncaissementId);
 
	enc.setDEVISE_ENC(EncaissementDetails.getDEVISE_ENC());
	enc.setMONT_ENC(EncaissementDetails.getMONT_ENC());
	enc.setREF_ACH_ENC(EncaissementDetails.getREF_ACH_ENC());
	enc.setREF_ADH_ENC(EncaissementDetails.getREF_ADH_ENC());
	enc.setREF_CTR_ENC(EncaissementDetails.getREF_CTR_ENC());
 
	enc.setVALIDE_ENC(EncaissementDetails.getVALIDE_ENC());


	final Encaissement updateEncaissement = ER.save(enc);
	return ResponseEntity.ok(updateEncaissement);
}

@PutMapping("employe/{id}")
public ResponseEntity<Encaissement> updateEmployee(@PathVariable(value = "id") int voyageId,
		@Valid @RequestBody Encaissement employeeDetails) {
	 
	

	
	final Encaissement updatedEmployee = ER.save(employeeDetails);
	return ResponseEntity.ok(updatedEmployee);
}
 
/*
@PostMapping("/encaissements")
public Encaissement addEncaissementc(@RequestBody Encaissement encaissement) {
    // Ajouter l'encaissement
    Encaissement newEncaissement = ER.save(encaissement);

    // Mettre à jour le montant du contrat
    Contrat contrat = CR.findById(encaissement.getREF_CTR_ENC());
    if (contrat != null) {
        double nouveauCA = contrat.getCA_CTR() - encaissement.getMONT_ENC();
        contrat.setCA_CTR(nouveauCA);
        CR.save(contrat);
    }
    Bordereau bord = BR.findById(encaissement.getBORD_ENC());
    if (bord != null) {
        double nouveauC = bord.getMONT_TOT_BORD() - encaissement.getMONT_ENC();
        bord.setMONT_TOT_BORD(nouveauC);
        BR.save(bord);
    }

    return newEncaissement;
}
@PostMapping("/encaissements1")
public Encaissement createEncaissement(@RequestBody Encaissement encaissement) {
	   // Récupérer le contrat associé à l'encaissement
    Contrat contrat = CR.getOne(encaissement.getREF_CTR_ENC());
    if (contrat != null) {
        // Mettre à jour les références dans l'encaissement
        encaissement.setREF_ADH_ENC(contrat.getID_ADER());
        encaissement.setREF_ACH_ENC(contrat.getID_ACHE());
    }
    return ER.save(encaissement);
}*/
@PostMapping("/encaissements")
public Encaissement addEncaissement(@RequestBody Encaissement encaissement) {
    // Ajouter l'encaissement
    Encaissement newEncaissement = ER.save(encaissement);

    // Mettre à jour le montant du contrat
     

    

    

    return ER.save(encaissement);
}
@PutMapping("modenc/{idEnc}")
public ResponseEntity<String> updateEncaissement(@PathVariable int idEnc) {
    try {
        SE.updateEncaissementValide(idEnc);
        return ResponseEntity.ok("Encaissement updated successfully.");
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Failed to update encaissement.");
    }
}
@GetMapping("consenc/{id}")
public ResponseEntity<Encaissement> getEncaissementById(@PathVariable(value = "id") int employeeId)
	 {
	Encaissement employee = ER.findById(employeeId);
	return ResponseEntity.ok().body(employee);
}
	@DeleteMapping("deleteenc/{id}")
	void delete(@PathVariable("id") int id)
	{
		ER.deleteById(id);
	}

}
