package com.blog.soat.graphql.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MissionDto {

	private String title;

	//	private String description;
	//
	//	private List<String> tags;

	private ClientDto client;
}
