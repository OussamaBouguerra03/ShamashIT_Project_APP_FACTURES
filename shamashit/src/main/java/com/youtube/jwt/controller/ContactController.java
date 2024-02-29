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
import org.springframework.web.bind.annotation.RestController;

import com.youtube.jwt.dao.ContactRepository;
import com.youtube.jwt.entity.Adresse;
import com.youtube.jwt.entity.Contact;
import com.youtube.jwt.service.ServiceContact;
 
@RestController
public class ContactController {
@Autowired
ServiceContact SCC;
@Autowired
ContactRepository CRR;

@PostMapping("AjouterContact")
public void AjouterContact(@RequestBody Contact contact)
{
SCC.AjouterContact(contact);	
}
@GetMapping("getContact")
List<Contact> getAll()
{
return SCC.getAll();	
}
@GetMapping("/contact-for-active-user")
public ResponseEntity<List<Contact>> getContratsForActiveUser(Authentication authentication) {
    String userName = authentication.getName();
    List<Contact> contrats = CRR.findadresseForActiveUser(userName);
    return ResponseEntity.ok(contrats);
}
@PutMapping("ModifierContact/{id}")
public ResponseEntity<Contact> updateContact(@PathVariable(value = "id") int ContactId,
		@Valid @RequestBody Contact ContactDetails) {
	Contact contact = CRR.findById(ContactId);

	contact.setACTIF_CONTACT(ContactDetails.getACTIF_CONTACT());
	contact.setFAX_CONTACT(ContactDetails.getFAX_CONTACT());
	contact.setMAIL1_COONTACT(ContactDetails.getMAIL1_COONTACT());
	contact.setMAIL2_COONTACT(ContactDetails.getMAIL2_COONTACT());
	contact.setPOS_CONTACT(ContactDetails.getPOS_CONTACT());
	contact.setTEL1_CONTACT(ContactDetails.getTEL1_CONTACT());
	contact.setTEL2_CONTACT(ContactDetails.getTEL2_CONTACT());


	
	final Contact updateContact = CRR.save(contact);
	return ResponseEntity.ok(updateContact);
}
@GetMapping("conscontact/{id}")
public ResponseEntity<Contact> getcontactById(@PathVariable(value = "id") int employeeId)
	 {
	Contact employee = CRR.findById(employeeId);
	return ResponseEntity.ok().body(employee);
}

@PutMapping("employeescontact/{id}")
public ResponseEntity<Contact> updatecontact(@PathVariable(value = "id") int voyageId,
		@Valid @RequestBody Contact employeeDetails) {
	Contact employee = CRR.findById(voyageId);

	employee.setREF_IND_CONTACT(employeeDetails.getREF_IND_CONTACT());
	employee.setACTIF_CONTACT(employeeDetails.getACTIF_CONTACT());
	employee.setPOS_CONTACT(employeeDetails.getPOS_CONTACT());
	employee.setMAIL1_COONTACT(employeeDetails.getMAIL1_COONTACT());
	employee.setMAIL2_COONTACT(employeeDetails.getMAIL2_COONTACT());
	employee.setTEL1_CONTACT(employeeDetails.getTEL1_CONTACT());
	employee.setTEL2_CONTACT(employeeDetails.getTEL2_CONTACT());
	employee.setFAX_CONTACT(employeeDetails.getFAX_CONTACT());

	
	final Contact updatedEmployee = CRR.save(employee);
	return ResponseEntity.ok(updatedEmployee);
}
@DeleteMapping("deleteContact/{id}")
void delete(@PathVariable("id") int id)
{
	SCC.supprimerContact(id);
}

}
