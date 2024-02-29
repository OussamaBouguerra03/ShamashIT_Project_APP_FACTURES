package com.youtube.jwt.service;

import java.util.List;

import com.youtube.jwt.entity.Individus;


public interface IServiceIndividu {
	public void AjouterIndividu(Individus individu);
	public void SupprimerIndividu (int REF_IND );
	public void ModifierIndividu(Individus individu);
	List<Individus> findall();
}
