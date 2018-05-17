package com.blog.soat.graphql.web.controller;

import com.blog.soat.graphql.dto.MissionDto;
import com.blog.soat.graphql.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/missions")
public class MissionController {

	@Autowired
	MissionService missionService;

	@GetMapping
	public List<MissionDto> getAllSoatien() {
		return missionService.retrieveAllMissions();
	}
}
