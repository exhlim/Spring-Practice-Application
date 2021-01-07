package com.exhlim.springpracticeapp.controllers;

import com.exhlim.springpracticeapp.service.JokeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeServiceController {
	private final JokeService jokeService;

	public JokeServiceController(@Qualifier("original") JokeService jokeService) {
		this.jokeService = jokeService;
	}
	@RequestMapping({"/", "", "/jokes"})
	public String getJoke(Model model) {
		String currentJoke = jokeService.getJoke();
		System.out.println(currentJoke);
		model.addAttribute("joke", currentJoke);
		/**Returning the html file in the templates dir**/
		return "chucknorris";
	}
}
