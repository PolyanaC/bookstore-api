package com.polyana.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polyana.bookstore.domain.Categoria;
import com.polyana.bookstore.domain.Livro;
import com.polyana.bookstore.repositories.CategoriaRepository;
import com.polyana.bookstore.repositories.LivroRepository;

@Service
public class DBService {
	
	@Autowired 
	private CategoriaRepository categoriaRepository;
	
	@Autowired 
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");
		Categoria cat2 = new Categoria(null, "Ficção Ciéntifica", "Sify");
		Categoria cat3 = new Categoria(null, "Romance", "Romaces/ Aventura");
		
		Livro l1 = new Livro(null, "Clean Code", "Robert Miro", "Lorem ipsum", cat1);
		Livro l2 = new Livro(null, "The Time Machine", "H.G. Wells", "Lorem ipsum", cat2);
		Livro l3 = new Livro(null, "Orgulho e Preconceito", "Janne Autens", "Lorem ipsum", cat3);
		Livro l4 = new Livro(null, "A Rebelde do Deserto", "Halwing R", "Lorem ipsum", cat3);
		Livro l5 = new Livro(null, "The War of the Worlds", "H. G. Wells", "Lorem ipsum", cat2);
		
		cat1.getLivros().addAll(Arrays.asList(l1));
		cat2.getLivros().addAll(Arrays.asList(l2, l5));
		cat3.getLivros().addAll(Arrays.asList(l3, l4));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
		
	}


}
