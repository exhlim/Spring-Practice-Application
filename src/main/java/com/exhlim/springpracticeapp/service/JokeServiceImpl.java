package com.exhlim.springpracticeapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("original")
public class JokeServiceImpl implements JokeService{
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	/** Added constructor for better efficiency so there is lesser recreation of the object
	 * 	This object will only be created once and added to the spring context
	 * **/
	public JokeServiceImpl() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}
}
