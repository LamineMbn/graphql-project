package com.blog.soat.graphql.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Mission {

	@Id
	@GeneratedValue
	@Column(name = "mission_id")
	private Long missionId;

	@Column(name = "mission_title")
	private String title;

	//	@Column(name = "mission_description")
	//	private String description;

	//    @Column(name = "mission_tags")
	//    private List<String> tags;

	@ManyToOne
	@JoinColumn(name = "client_id", nullable = false)
	private Client client;
}
