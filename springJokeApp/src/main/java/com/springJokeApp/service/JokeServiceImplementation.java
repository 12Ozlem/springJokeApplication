package com.springJokeApp.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
@Service
@Primary
public class JokeServiceImplementation implements JokeService{

	@Override
	public String randomJoke() {
		
		ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
		return quotes.getRandomQuote();
	}



}
