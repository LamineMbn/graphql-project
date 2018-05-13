package com.blog.soat.graphql.mapper;

import com.blog.soat.graphql.dto.ClientDto;
import com.blog.soat.graphql.dto.MissionDto;
import com.blog.soat.graphql.entities.Client;
import com.blog.soat.graphql.entities.Mission;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MissionMapper {

	MissionMapper INSTANCE = Mappers.getMapper(MissionMapper.class);

	MissionDto missionToMissionDto(Mission mission);

	ClientDto clientToClientDto(Client client);
}
