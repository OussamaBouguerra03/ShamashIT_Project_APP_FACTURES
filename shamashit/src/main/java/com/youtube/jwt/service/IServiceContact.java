package com.youtube.jwt.service;

import java.util.List;

import com.youtube.jwt.entity.Contact;

 
public interface IServiceContact {
public void AjouterContact(Contact contact);
public void ModifierContact(Contact contact);
List<Contact> getAll();
public void supprimerContact(int id);
}
