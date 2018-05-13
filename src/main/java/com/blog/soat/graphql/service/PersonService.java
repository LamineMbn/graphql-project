package com.blog.soat.graphql.service;

import com.blog.soat.graphql.dto.PersonDto;
import com.blog.soat.graphql.entities.Person;
import com.blog.soat.graphql.mapper.PersonMapper;
import com.blog.soat.graphql.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

	private PersonRepository personRepository;

	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public List<PersonDto> retrieveAllSoatien() {
		List<Person> people = (List<Person>) personRepository.findAll();

		return people.stream()
				.map(person -> PersonMapper.INSTANCE.personToPersonDto(person))
				.collect(Collectors.toList());
	}
}
