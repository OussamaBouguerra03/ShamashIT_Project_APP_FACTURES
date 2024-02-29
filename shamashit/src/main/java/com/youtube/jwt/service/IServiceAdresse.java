package com.youtube.jwt.service;

import java.util.List;

import com.youtube.jwt.entity.Adresse;

 
public interface IServiceAdresse {
public void AjouterAdresse(Adresse adresse);
public void ModifierAdresse(Adresse adresse);
public void SupprimerAdresse(int ID_ADR);
List<Adresse> findAll();
}
