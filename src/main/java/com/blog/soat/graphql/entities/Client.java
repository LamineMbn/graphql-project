package com.blog.soat.graphql.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Getter
@Setter
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
