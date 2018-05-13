package com.blog.soat.graphql.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client {

	@Id
	@GeneratedValue
	@Column(name = "client_id")
	private Long clientId;

	@Column(name = "client_name")
	private String name;

	@OneToMany(mappedBy = "client")
	private Set<Mission> missions;
}
