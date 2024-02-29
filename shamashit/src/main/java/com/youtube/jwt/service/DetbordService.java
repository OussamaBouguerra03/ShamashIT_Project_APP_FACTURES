package com.youtube.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.jwt.dao.DetBordRepository;
import com.youtube.jwt.entity.DetailBordereau;

@Service
public class DetbordService {
@Autowired
DetBordRepository dt;
	public List<DetailBordereau> findAll() {
		// TODO Auto-generated method stub
		List<DetailBordereau> cont =(List<DetailBordereau>)(dt.findAll());
		return cont;	}

}
