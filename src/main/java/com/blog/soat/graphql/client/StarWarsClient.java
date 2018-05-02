package com.blog.soat.graphql.client;

import com.blog.soat.graphql.model.StarWarsPerson;
import feign.Param;
import feign.RequestLine;

public interface StarWarsClient {

	@RequestLine("GET /{id}")
	StarWarsPerson findById(@Param("id") String id);
}
