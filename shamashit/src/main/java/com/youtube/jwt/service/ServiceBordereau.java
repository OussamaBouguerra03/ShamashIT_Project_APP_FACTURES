package com.youtube.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.jwt.dao.BordereauRepository;
import com.youtube.jwt.entity.Bordereau;

@Service
public class ServiceBordereau implements IServiceBordereau {
    @Autowired
    private BordereauRepository bordereauRepository;

    public ServiceBordereau(BordereauRepository bordereauRepository) {
        this.bordereauRepository = bordereauRepository;
    }

    @Override
    public void saisirBordereau(Bordereau bordereau) {
        bordereauRepository.save(bordereau);
    }

    @Override
    public List<Bordereau> findAll() {
        return bordereauRepository.findAll();
    }

    @Override
    public void update(Bordereau bordereau) {
        bordereauRepository.save(bordereau);
    }
}
