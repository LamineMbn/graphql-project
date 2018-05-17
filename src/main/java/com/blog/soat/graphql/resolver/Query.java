package com.blog.soat.graphql.resolver;

import com.blog.soat.graphql.dto.MissionDto;
import com.blog.soat.graphql.dto.PersonDto;
import com.blog.soat.graphql.service.MissionService;
import com.blog.soat.graphql.service.PersonService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

	private PersonService personService;
	private MissionService missionService;

	public Query(PersonService personService, MissionService missionService) {
		this.personService = personService;
		this.missionService = missionService;
	}

	public List<PersonDto> findAllSoatien() {
		return personService.retrieveAllSoatien();
	}

	public List<MissionDto> findAllMissions() {
		return missionService.retrieveAllMissions();
	}

}
