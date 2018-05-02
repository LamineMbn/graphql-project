package com.blog.soat.graphql.web.controller;

import com.blog.soat.graphql.model.StarWarsPerson;
import com.blog.soat.graphql.client.StarWarsClient;
import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/starwars")
public class StarWarsController {

	@GetMapping(path = "peoples")
	public StarWarsPerson findStarwWarsPerson(){
		StarWarsClient starWarsClient = Feign.builder()
				.client(new OkHttpClient())
				.encoder(new GsonEncoder())
				.decoder(new GsonDecoder())
				.logger(new Slf4jLogger(StarWarsClient.class))
				.logLevel(Logger.Level.FULL)
				.target(StarWarsClient.class, "https://swapi.co/api/people");

		return starWarsClient.findById("1");
	}
}
