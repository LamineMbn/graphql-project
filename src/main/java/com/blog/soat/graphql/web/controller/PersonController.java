package com.blog.soat.graphql.web.controller;

import com.blog.soat.graphql.dto.PersonDto;
import com.blog.soat.graphql.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/soatien")
public class PersonController {

	@Autowired
	PersonService personService;

	@GetMapping
	public List<PersonDto> getAllSoatien() {
		return personService.retrieveAllSoatien();
	}
}
