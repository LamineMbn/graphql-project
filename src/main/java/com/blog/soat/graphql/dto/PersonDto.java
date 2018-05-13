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
public class PersonDto {

	private String firstName;

	private String lastName;

	private String company;

	private String email;

	private Integer age;

	private Boolean active;

	private String phone;

	private MissionDto mission;
}
