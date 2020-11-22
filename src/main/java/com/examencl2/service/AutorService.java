package com.examencl2.service;

import java.util.List;

import com.examencl2.entity.Autor;

public interface AutorService {
	public abstract Autor insertarAutor(Autor obj);
	 public abstract List<Autor> listaAutor();
}
