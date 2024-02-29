package com.youtube.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.youtube.jwt.dao.DetBordRepository;
import com.youtube.jwt.dao.LettrageRepository;
import com.youtube.jwt.entity.Individus;
import com.youtube.jwt.entity.TJ_LETTRAGE;
 
@RestController
public class LetrrageController {
	@Autowired
	LettrageRepository LR;
@Autowired
DetBordRepository detBordRepository;
@PostMapping("AddLettrage")
public void ajouterlettrage(@RequestBody TJ_LETTRAGE tl)
{
 
LR.save(tl);
}
 
@PutMapping("/lettragemod/{idDetBord}/{idEnc}")
public ResponseEntity<String> updateMontOuvDetBord(@PathVariable int idDetBord, @PathVariable int idEnc) {
    detBordRepository.updateMontOuvDetBordByIdAndIdEnc(idDetBord, idEnc);
    return ResponseEntity.ok("Mise à jour réussie.");
}
@GetMapping("getlet/{REF_CTR}")
private Object[] findByRefCtr(@PathVariable(value ="REF_CTR") int refCtr){
	
	return LR.findFirstByOrderByIdDesc(refCtr); 
}
@GetMapping("/getlet")  
@ResponseBody
private List<TJ_LETTRAGE> getAll()   
{  
return LR.findall();  
}
}
