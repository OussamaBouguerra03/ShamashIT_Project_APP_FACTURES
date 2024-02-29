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

import com.youtube.jwt.dao.IndividuRepository;
import com.youtube.jwt.entity.Contact;
import com.youtube.jwt.entity.Contrat;
import com.youtube.jwt.entity.Individus;
import com.youtube.jwt.service.ServiceIndividu;
import com.youtube.jwt.service.UserService;
import com.youtube.jwt.entity.User;

  

@RestController

public class IndividuController {
	@Autowired
	ServiceIndividu SI;
	@Autowired
	IndividuRepository IR;
	 @Autowired
	    private UserService userService;
	 @PostMapping("ajouterindividu")
	    public void AjouterIndividu(@RequestBody Individus individu) {
	        try {
	        	 individu.setLOGIN_IND(individu.getNOM_IND());
	        	    individu.setPASS_IND(String.valueOf(individu.getNUM_PIECE_IND()));
	        	 // Créer un nouvel utilisateur en fonction des informations de l'individu
	                User newUser = new User();
	                newUser.setUserName(individu.getLOGIN_IND());
	                newUser.setUserFirstName(individu.getNOM_IND());
	                newUser.setUserLastName(individu.getPRENOM_IND());
	                newUser.setUserPassword(individu.getPASS_IND());

	                // Enregistrer le nouvel utilisateur
	                userService.registerNewUser(newUser);

	            SI.AjouterIndividu(individu);
	        } catch (IndividuExistException e) {
	            // Gérer l'erreur, par exemple renvoyer une réponse HTTP avec le message d'erreur approprié
	        }
	        catch (EmailExistException e) {
	            // Gérer l'erreur EmailExistException
	            // Par exemple, renvoyer une réponse HTTP avec le message d'erreur approprié
	        }
	    }
	 public class EmailExistException extends RuntimeException {
		    public EmailExistException(String message) {
		        super(message);
		    }
		}
	 public class IndividuExistException extends RuntimeException {
		    public IndividuExistException(String message) {
		        super(message);
		    }
		}

	@DeleteMapping("deleteindividu/{id}")
	void delete(@PathVariable("id") int id)
	{
		SI.SupprimerIndividu(id);
	}
	
	@GetMapping("/getindividu")  
	@ResponseBody
	private List<Individus> getAllIndividu()   
	{  
	return SI.findall();  
	}
	@GetMapping("/individu-for-active-user")
	public ResponseEntity<List<Individus>> getContratsForActiveUser(Authentication authentication) {
	    String userName = authentication.getName();
	    List<Individus> contrats = IR.findindivisuForActiveUser(userName);
	    return ResponseEntity.ok(contrats);
	}
	@GetMapping("findup/{id}")
	public ResponseEntity<Individus> getEmployeeById(@PathVariable(value = "id") int employeeId)
		 {
		Individus employee = IR.findById(employeeId);
		return ResponseEntity.ok().body(employee);
	}
	@GetMapping("consindividu/{id}")
	public ResponseEntity<Individus> getcontactById(@PathVariable(value = "id") int employeeId)
		 {
		Individus employee = IR.findById(employeeId);
		return ResponseEntity.ok().body(employee);
	}

	@PutMapping("employeesindividu/{id}")
	public ResponseEntity<Individus> updatecontact(@PathVariable(value = "id") int voyageId,
			@Valid @RequestBody Individus employeeDetails) {
		Individus employee = IR.findById(voyageId);

		employee.setNOM_IND(employeeDetails.getNOM_IND());
		employee.setPRENOM_IND(employeeDetails.getPRENOM_IND());
		employee.setDAT_NAISSANCE(employeeDetails.getDAT_NAISSANCE());
		employee.setDAT_PIECE(employeeDetails.getDAT_PIECE());
		employee.setLANGUE_IND(employeeDetails.getLANGUE_IND());
		employee.setLIEU_PIECE_IND(employeeDetails.getLIEU_PIECE_IND());
		employee.setEMAIL_IND(employeeDetails.getEMAIL_IND());
		employee.setFAX_IND(employeeDetails.getFAX_IND());
		employee.setLOGIN_IND(employeeDetails.getLOGIN_IND());
		employee.setNATIONALITE_IND(employeeDetails.getNATIONALITE_IND());
		employee.setPASS_IND(employeeDetails.getPASS_IND());
		employee.setPIECE_IND(employeeDetails.getPIECE_IND());
		employee.setPROFESSION_IND(employeeDetails.getPROFESSION_IND());
		
		
		final Individus updatedEmployee = IR.save(employee);
		return ResponseEntity.ok(updatedEmployee);
	}
	
}


