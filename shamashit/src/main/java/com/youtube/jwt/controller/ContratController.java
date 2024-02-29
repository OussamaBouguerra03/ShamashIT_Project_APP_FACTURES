package com.youtube.jwt.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import com.youtube.jwt.dao.ContratRepository;
import com.youtube.jwt.dao.DetBordRepository;
import com.youtube.jwt.dao.IndividuRepository;
import com.youtube.jwt.entity.Contrat;
import com.youtube.jwt.entity.DetailBordereau;
import com.youtube.jwt.entity.Individus;
import com.youtube.jwt.service.DetbordService;
import com.youtube.jwt.service.ServiceContrat;
import com.youtube.jwt.service.ServiceFinancement;
import com.youtube.jwt.dao.tjcirRepository;
import com.youtube.jwt.entity.TJ_CIR;


@RestController
 public class ContratController {
@Autowired
ServiceContrat SC;
@Autowired
ContratRepository CR;
@Autowired
tjcirRepository tjcirRepository;
@Autowired
IndividuRepository individuRepository;
@Autowired
DetBordRepository dt;
@Autowired
DetbordService ds;
@Autowired 
ServiceFinancement fs;
@PostMapping("ajoutercontrat")
public void AjouterContrat(@RequestBody Contrat contrat) {
    contrat.setDEVISE_CTR("TND"); 

	Contrat nouveauContrat = CR.save(contrat);
 
      TJ_CIR tj_cirAdherent = new TJ_CIR();
    tj_cirAdherent.setREF_CTR_CIR(nouveauContrat.getREF_CTR()); 
     tj_cirAdherent.setID_ROLE_CIR("adherent");

    tjcirRepository.save(tj_cirAdherent);

     TJ_CIR tj_cirAcheteur = new TJ_CIR();
    tj_cirAcheteur.setREF_CTR_CIR(nouveauContrat.getREF_CTR()); 
     tj_cirAcheteur.setID_ROLE_CIR("acheteur");

    tjcirRepository.save(tj_cirAcheteur);
	SC.AjouterContrat(contrat);
	 
}
@GetMapping("/contrats-for-active-user")
public ResponseEntity<List<Contrat>> getContratsForActiveUser(Authentication authentication) {
    String userName = authentication.getName();
    List<Contrat> contrats = CR.findContratsForActiveUser(userName);
    return ResponseEntity.ok(contrats);
}
@GetMapping("/getcontrat")  
@ResponseBody
private List<Contrat> getAllContrat()   
{   
return SC.findall();  
}
@GetMapping("/getdd")
@ResponseBody
private List<DetailBordereau> getAlld() {
    return dt.findbyDate();
}

@GetMapping("/getdda")
@ResponseBody
private List<DetailBordereau> getAllda() {
    return (List<DetailBordereau>) dt.findAll();
}

 

@GetMapping("het/{REF_CTR_DET_BORD}")
private Object[] findbyID(@PathVariable(value ="REF_CTR_DET_BORD") int refCtr){
return dt.findbyID(refCtr);	
}
    @DeleteMapping("deletecontrat/{id}")
    void delete(@PathVariable("id") int id)
    {
        CR.deleteById(id);
    }

}



