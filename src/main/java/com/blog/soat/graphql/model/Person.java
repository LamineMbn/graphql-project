package com.blog.soat.graphql.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	private String firstName;
	private String lastName;
	private String company;
	private String email;
	private Integer age;
	private Boolean isActive;
	private String balance;
	private String phone;

	@ManyToMany
	@JoinTable(
			name = "FRIENDS",
			joinColumns = @JoinColumn(name = "PERSON_ID", referencedColumnName = "ID"),
			inverseJoinColumns = @JoinColumn(name = "FRIEND_ID", referencedColumnName = "ID")
	)
	private Set<Person> friends;
}

