package com.zheyong.jokesapp.services;

import org.springframework.stereotype.Service;

import com.zheyong.jokesapp.models.Joke;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

	private ChuckNorrisQuotes chuckNorrisQuotes;
	
	public JokeServiceImpl() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}
	
	@Override
	public Joke getJoke() {
		Joke joke = new Joke();
		joke.setJoke(chuckNorrisQuotes.getRandomQuote());
		return joke;
	}

}
