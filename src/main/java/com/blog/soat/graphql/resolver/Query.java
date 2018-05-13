package com.blog.soat.graphql.resolver;

import com.blog.soat.graphql.entities.Mission;
import com.blog.soat.graphql.entities.Person;
import com.blog.soat.graphql.repository.MissionRepository;
import com.blog.soat.graphql.repository.PersonRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

	private PersonRepository personRepository;
	private MissionRepository missionRepository;

	public Query(PersonRepository personRepository, MissionRepository missionRepository) {
		this.personRepository = personRepository;
		this.missionRepository = missionRepository;
	}

	public Iterable<Person> findAllSoatien() {
		return personRepository.findAll();
	}

	public Iterable<Mission> findAllMissions() {
		return missionRepository.findAll();
	}

}
