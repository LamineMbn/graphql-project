package com.blog.soat.graphql.repository;

import com.blog.soat.graphql.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
