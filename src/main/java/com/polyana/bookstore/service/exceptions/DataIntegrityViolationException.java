package com.polyana.bookstore.service.exceptions;

public class DataIntegrityViolationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DataIntegrityViolationException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataIntegrityViolationException(String message) {
		super(message);
	}
	
}

/*
 * Quando tentamos deletar uma categoria que 
 * possui objetoa associados recebemos um erro 
 * de DataIntegrityViolationException
 * Esse erro vem do próprio banco de dados*/
