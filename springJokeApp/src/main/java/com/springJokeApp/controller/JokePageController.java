package com.springJokeApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springJokeApp.service.JokeService;

@Controller
public class JokePageController {
	
	private JokeService jokeService;
	
	@Autowired
	public JokePageController(JokeService jokeService) {
		this.jokeService = jokeService;
	}


	@RequestMapping("/")
	public String randomJoke(Model theModel) {
		theModel.addAttribute("joke", jokeService.randomJoke());
		return "jokePage";
	}

}
