package com.blog.soat.graphql.resolver;

import com.blog.soat.graphql.entities.Client;
import com.blog.soat.graphql.entities.Mission;
import com.blog.soat.graphql.repository.MissionRepository;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Set;

@Component
public class ClientQueryResolver implements GraphQLResolver<Client> {

	private MissionRepository missionRepository;

	public ClientQueryResolver(MissionRepository missionRepository) {
		this.missionRepository = missionRepository;
	}

	public Iterable<Mission> getMissions(Client client){
		return this.missionRepository.findAllByClientClientId(client.getClientId());
	}
}
