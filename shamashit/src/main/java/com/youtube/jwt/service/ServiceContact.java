package com.youtube.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.jwt.dao.ContactRepository;
import com.youtube.jwt.entity.Contact;
 

@Service
public class ServiceContact implements IServiceContact {
@Autowired
ContactRepository CRR;
	@Override
	public void AjouterContact(Contact contact) {
CRR.save(contact);		
	}

	@Override
	public void ModifierContact(Contact contact) {
CRR.save(contact);		
	}

	@Override
	public List<Contact> getAll() {
		List<Contact> contact =(List<Contact>)(CRR.findAll());
		return contact;
	}

	@Override
	public void supprimerContact(int id) {
CRR.deleteById(id);		
	}
 

}
