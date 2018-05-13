package com.blog.soat.graphql.repository;

import com.blog.soat.graphql.entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
}
