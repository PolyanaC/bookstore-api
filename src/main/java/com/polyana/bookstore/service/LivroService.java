package com.polyana.bookstore.service;

import java.util.List;
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
	
	@Autowired
	private CategoriaService categoriaService;
	
	public Livro findById(Integer id) {
		Optional<Livro> obj = livroRepository.findById(id);
		return obj.orElseThrow(() -> new  ObjectNotFoundException(
				"Livro não  encontrado " + id + " Tipo: " + Livro.class.getName()));
	}

	public List<Livro> findAll(Integer id_cat) {
		
		//Primeiro verificamos se o id da categoria realmente existe
		categoriaService.findById(id_cat);
		
		//Este metodo não existe então foi criado a mão
		return livroRepository.findAllByCategoria(id_cat);
	}
	

}
