package com.blog.soat.graphql;

import com.blog.soat.graphql.model.Person;
import com.blog.soat.graphql.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner {

	@Autowired
	PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//		personRepository.save(Person.builder().firstName("Lamine").lastName("Le loup").build());
		//		personRepository.save(Person.builder().firstName("Toto").lastName("Tata").build());

//		List<Person> personList = personRepository.findAll()findAll();
//
//		personList.forEach(person -> System.out.println("Name = " + person.getFirstName() + person.getLastName()));
	}

}
