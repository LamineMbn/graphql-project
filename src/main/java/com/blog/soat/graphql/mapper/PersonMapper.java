package com.blog.soat.graphql.mapper;

import com.blog.soat.graphql.dto.MissionDto;
import com.blog.soat.graphql.dto.PersonDto;
import com.blog.soat.graphql.entities.Mission;
import com.blog.soat.graphql.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

	PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

	PersonDto personToPersonDto(Person person);

	MissionDto missionToMissionDto(Mission mission);
}
