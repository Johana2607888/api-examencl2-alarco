package com.examencl2.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import com.examencl2.entity.Autor;
import com.examencl2.service.AutorService;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/rest/autor/")
public class AutorController {
	@Autowired
	private AutorService service;
	
	@GetMapping
	public ResponseEntity<List<Autor>> listar(){
		return ResponseEntity.ok(service.listaAutor());
	}
	
	@PostMapping
	public ResponseEntity<Autor> inserta(@RequestBody Autor obj){
		return ResponseEntity.ok(service.insertarAutor(obj));
	}
}
