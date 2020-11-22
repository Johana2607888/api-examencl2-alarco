package com.examencl2.service;


import java.util.List;
import org.springframework.stereotype.Service;
import com.examencl2.entity.Autor;
import com.examencl2.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AutorServiceImpl implements AutorService {

	@Autowired
	private AutorRepository repository;
	
	@Override
	public Autor insertarAutor(Autor obj) {
		
		return repository.save(obj);
	}

	@Override
	public List<Autor> listaAutor() {
		
		return repository.findAll();
	}

}
