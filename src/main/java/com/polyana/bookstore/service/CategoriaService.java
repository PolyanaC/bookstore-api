package com.polyana.bookstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polyana.bookstore.domain.Categoria;
import com.polyana.bookstore.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	public Categoria findById(Integer id) {
		//Pd ser que encontre a categoria ou que não encontre, por isso o uso do Optional
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.orElse(null);
	}

}
