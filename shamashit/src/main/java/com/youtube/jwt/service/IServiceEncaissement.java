package com.youtube.jwt.service;

import java.util.List;

import com.youtube.jwt.entity.Encaissement;

 
public interface IServiceEncaissement {
public void AjouterEncaissement(Encaissement encaissement);
public void ModifierEncaissement(Encaissement encaissement);
List<Encaissement> findAll();
}
