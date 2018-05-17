package com.blog.soat.graphql.repository;

import com.blog.soat.graphql.entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PersonRepository extends CrudRepository<Person, Long> {
}
