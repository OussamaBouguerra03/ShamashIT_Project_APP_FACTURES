package com.youtube.jwt.controller;

import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import com.youtube.jwt.dao.BordereauRepository;
import com.youtube.jwt.dao.DetBordRepository;
import com.youtube.jwt.entity.Bordereau;
import com.youtube.jwt.entity.DetailBordereau;
import com.youtube.jwt.service.ServiceBordereau;

@RestController
public class BordereauController {

    @Autowired
    private ServiceBordereau ServiceBordereau ;

    @Autowired
    private BordereauRepository BR;

    @Autowired
    private DetBordRepository DR;



    @PostMapping("SaisirBordereau")
    public void SaisirBordereau(@RequestBody Bordereau bordereau) {
        BR.save(bordereau);
    }

    @PostMapping("ajoutBordereau")
    public void ajoutBordereau(@RequestBody DetailBordereau detbr) {
        Bordereau dernierBordereau = BR.findFirstByOrderByIdDesc();
        if (dernierBordereau != null) {
            detbr.setNUM_BORD(dernierBordereau.getNUM_BORD());
            detbr.setANNEE_BORD(dernierBordereau.getANNEE_BORD());
            detbr.setREF_CTR_DET_BORD(dernierBordereau.getREF_CTR_BORD());
        }

        detbr.setVALIDE_DET_BORD(1);
        DR.save(detbr);

        // Envoyer un message WebSocket pour informer les clients de la mise à jour
    }

    @GetMapping("getbord")
    @ResponseBody
    private List<Bordereau> getAll() {
        return ServiceBordereau.findall();
    }

    @GetMapping("getbordo")
    @ResponseBody
    private Set<Bordereau> getbord() {
        Set<Bordereau> bordereaux = BR.findValide();

        // Envoyer les données via WebSocket

        return bordereaux;
    }

    @GetMapping("getbordoo")
    @ResponseBody
    private Set<Bordereau> getbordos() {
        return BR.findValides();
    }

  

    @PutMapping("updatevoyage")
    void update(@RequestBody Bordereau v) {
        ServiceBordereau.update(v);
    }

    @PutMapping("employees/{id}")
    public ResponseEntity<Bordereau> updateEmployee(@PathVariable(value = "id") int voyageId,
                                                    @Valid @RequestBody Bordereau employeeDetails) {
        Bordereau employee = BR.findById(voyageId);

        employee.setVALIDE_BORD(employeeDetails.getVALIDE_BORD());

        final Bordereau updatedEmployee = BR.save(employee);
        return ResponseEntity.ok(updatedEmployee);
    }

    @GetMapping("/bord-for-active-user")
    public ResponseEntity<List<Bordereau>> getContratsForActiveUser(Authentication authentication) {
        String userName = authentication.getName();
        List<Bordereau> contrats = BR.findbordForActiveUser(userName);
        return ResponseEntity.ok(contrats);
    }

    @GetMapping("cons/{id}")
    public ResponseEntity<Bordereau> getEmployeeById(@PathVariable(value = "id") int employeeId) {
        Bordereau employee = BR.findById(employeeId);
        return ResponseEntity.ok().body(employee);
    }
}
