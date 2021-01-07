package com.exhlim.springpracticeapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("number")
public class JokeServiceImpl2 implements JokeService {

    private ChuckNorrisQuotes chuckNorrisQuotes;
    @Autowired
    public JokeServiceImpl2(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return "lollolol";
    }
}
