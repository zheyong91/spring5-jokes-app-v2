package com.zheyong.jokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zheyong.jokesapp.models.Joke;
import com.zheyong.jokesapp.services.JokeService;

@Controller
public class JokesController {

	private final JokeService jokeService;

	public JokesController(JokeService jokeService) {
		this.jokeService = jokeService;
	}

	@RequestMapping({"/",""})
	public String getJoke(Model model) {
		Joke joke = jokeService.getJoke();
		model.addAttribute("joke", joke);
		return "index";
	}
}
