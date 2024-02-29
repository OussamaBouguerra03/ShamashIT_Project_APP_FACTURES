package com.youtube.jwt.service;

import java.util.List;

 import com.youtube.jwt.entity.Contrat;

 
public interface IServiceContrat {
	public void AjouterContrat(Contrat contrat);
	public void ModifierContrat(Contrat contrat);
	List<Contrat> findall();
 	
}
