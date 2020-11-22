package com.examencl2.service;


import java.util.List;

import com.examencl2.entity.Pais;
import com.examencl2.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisServiceImpl implements PaisService {

	@Autowired
	private PaisRepository repository;
	
	@Override
	public List<Pais> listaPais() {
		
		return repository.findAll();
	}
	
}
