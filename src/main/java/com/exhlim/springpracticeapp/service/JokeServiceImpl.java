package com.exhlim.springpracticeapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	/** Added constructor for better efficiency so there is lesser recreation of the object
	 * 	This object will only be created once and added to the spring context
	 * **/
	public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}
}
