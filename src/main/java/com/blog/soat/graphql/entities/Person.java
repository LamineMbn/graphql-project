package com.blog.soat.graphql.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {

	@Id
	@GeneratedValue
	@Column(name = "person_id")
	private Long personId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "company")
	private String company;

	@Column(name = "email")
	private String email;

	@Column(name = "age")
	private Integer age;

	@Column(name = "active")
	private Boolean active;

	@Column(name = "phone")
	private String phone;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mission_id")
	private Mission mission;
}

