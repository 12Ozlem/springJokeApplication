package com.springJokeApp.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
@Service
@Primary
public class JokeServiceImplementation implements JokeService{
	
	private final ChuckNorrisQuotes quotes;
	
	

	public JokeServiceImplementation() {
		this.quotes = new ChuckNorrisQuotes();
	}



	@Override
	public String randomJoke() {
		
		return quotes.getRandomQuote();
	}



}
