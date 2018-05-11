package com.blog.soat.graphql.repository;

import com.blog.soat.graphql.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
