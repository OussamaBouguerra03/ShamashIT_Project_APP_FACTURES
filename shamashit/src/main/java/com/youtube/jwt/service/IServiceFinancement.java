package com.youtube.jwt.service;

import java.util.List;

import com.youtube.jwt.entity.Financement;

 
public interface IServiceFinancement {
public void AjouterFinancement(Financement financement);
public void ModifierFinancement(Financement financement);
List<Financement> findAll();
}
