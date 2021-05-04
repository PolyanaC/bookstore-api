package com.polyana.bookstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polyana.bookstore.domain.Livro;
import com.polyana.bookstore.repositories.LivroRepository;
import com.polyana.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository livroRepository;
	
	public Livro findById(Integer id) {
		Optional<Livro> obj = livroRepository.findById(id);
		return obj.orElseThrow(() -> new  ObjectNotFoundException(
				"Livro não  encontrado " + id + " Tipo: " + Livro.class.getName()));
	}
	

}
