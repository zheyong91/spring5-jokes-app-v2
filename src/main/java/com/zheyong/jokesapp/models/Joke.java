package com.zheyong.jokesapp.models;

public class Joke {
	private String jokeContent;

	public Joke() {
	}

	public Joke(String joke) {
		this.jokeContent = joke;
	}

	public String getJoke() {
		return jokeContent;
	}

	public void setJoke(String joke) {
		this.jokeContent = joke;
	}

}
