package com.blog.soat.graphql.repository;

import com.blog.soat.graphql.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, Long> {
}
