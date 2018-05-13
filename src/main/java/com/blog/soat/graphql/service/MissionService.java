package com.blog.soat.graphql.service;

import com.blog.soat.graphql.dto.MissionDto;
import com.blog.soat.graphql.entities.Mission;
import com.blog.soat.graphql.mapper.MissionMapper;
import com.blog.soat.graphql.repository.MissionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MissionService {

	private MissionRepository missionRepository;

	public MissionService(MissionRepository missionRepository) {
		this.missionRepository = missionRepository;
	}

	public List<MissionDto> retrieveAllMissions() {
		List<Mission> missions = (List<Mission>) missionRepository.findAll();

		return transformToDto(missions);
	}

	public List<MissionDto> retrieveMissionsByClientId(Long id) {
		List<Mission> missions = (List<Mission>) missionRepository.findAllByClientClientId(id);

		return transformToDto(missions);
	}

	private List<MissionDto> transformToDto(List<Mission> missions) {
		return missions.stream()
				.map(mission -> MissionMapper.INSTANCE.missionToMissionDto(mission))
				.collect(Collectors.toList());
	}
}
