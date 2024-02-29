package com.youtube.jwt.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.youtube.jwt.dao.AdresseRepository;
import com.youtube.jwt.entity.Adresse;
import com.youtube.jwt.entity.Bordereau;
import com.youtube.jwt.entity.Contrat;
import com.youtube.jwt.service.ServiceAdresse;
 

@RestController
public class AdresseController {
@Autowired
ServiceAdresse SA;
@Autowired
AdresseRepository AR;
@PostMapping("ajouterAdresse")
public void AjouterAdresse(@RequestBody Adresse adresse) {
	SA.AjouterAdresse(adresse);
}	
@DeleteMapping("deleteAdresse/{id}")
void delete(@PathVariable("id") int id)
{
	SA.SupprimerAdresse(id);
}
@GetMapping("/getAdresse")  
@ResponseBody
private List<Adresse> getAllAdresse()   
{  
return SA.findAll(); 
}

@GetMapping("/adresse-for-active-user")
public ResponseEntity<List<Adresse>> getContratsForActiveUser(Authentication authentication) {
    String userName = authentication.getName();
    List<Adresse> contrats = AR.findadresseForActiveUser(userName);
    return ResponseEntity.ok(contrats);
}
@PutMapping("UpdateAdresse/{id}")
public ResponseEntity<Adresse> updateAdresse(@PathVariable(value = "id") int AdresseId,
		@Valid @RequestBody Adresse AdresseDetails) {
	Adresse adr = AR.findById(AdresseId);

	adr.setACTIF_ADR(AdresseDetails.getACTIF_ADR());
	adr.setLIB_ADR(AdresseDetails.getLIB_ADR());
	adr.setREF_IND_ADR(AdresseDetails.getREF_IND_ADR());

	
	final Adresse updateAdresse = AR.save(adr);
	return ResponseEntity.ok(updateAdresse);
}

@GetMapping("consadress/{id}")
public ResponseEntity<Adresse> getEmployeeById(@PathVariable(value = "id") int employeeId)
	 {
	Adresse employee = AR.findById(employeeId);
	return ResponseEntity.ok().body(employee);
}

@PutMapping("employeesafress/{id}")
public ResponseEntity<Adresse> updateEmployee(@PathVariable(value = "id") int voyageId,
		@Valid @RequestBody Adresse employeeDetails) {
	Adresse employee = AR.findById(voyageId);

	employee.setREF_IND_ADR(employeeDetails.getREF_IND_ADR());
	employee.setID_NLDP(employeeDetails.getID_NLDP());
	employee.setLIB_ADR(employeeDetails.getLIB_ADR());
	employee.setID_GOUV_ADR(employeeDetails.getID_GOUV_ADR());
	employee.setID_CP(employeeDetails.getID_CP());
	employee.setACTIF_ADR(employeeDetails.getACTIF_ADR());

	
	final Adresse updatedEmployee = AR.save(employee);
	return ResponseEntity.ok(updatedEmployee);
}

}
