package com.youtube.jwt.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.youtube.jwt.dao.FinancementRepository;
import com.youtube.jwt.entity.Financement;
import com.youtube.jwt.service.ServiceFinancement;
 

@RestController
public class FinancementController {
@Autowired
ServiceFinancement SF;
@Autowired
FinancementRepository FR;

@PostMapping("AjouterFinancement")
public void AjouterFinancement(@RequestBody Financement financement)
{
SF.AjouterFinancement(financement);	
}
@GetMapping("getFinancement")
List<Financement> getAllFinancement()
{
return SF.findAll();	
}

 
@PutMapping("ModifierFinancement/{id}")
public ResponseEntity<Financement> updateFinancement(@PathVariable(value = "id") int FinancementId,
		@Valid @RequestBody Financement FinancementDetails) {
	Financement finan = FR.findById(FinancementId);

	finan.setINSTR_FIN(FinancementDetails.getINSTR_FIN());
	finan.setDAT_FIN(FinancementDetails.getDAT_FIN());
	finan.setDAT_INSTR_FIN(FinancementDetails.getDAT_INSTR_FIN());
	finan.setMONT_FIN(FinancementDetails.getMONT_FIN());
	finan.setREF_INSTR_FIN(FinancementDetails.getREF_INSTR_FIN());
	finan.setETAT_FIN(FinancementDetails.getETAT_FIN());


	final Financement updateFinancement = FR.save(finan);
	return ResponseEntity.ok(updateFinancement);
}
}
