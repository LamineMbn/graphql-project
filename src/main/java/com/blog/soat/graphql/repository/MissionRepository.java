package com.blog.soat.graphql.repository;

import com.blog.soat.graphql.entities.Mission;
import org.springframework.data.repository.CrudRepository;

public interface MissionRepository extends CrudRepository<Mission, Long> {

	Iterable<Mission> findAllByClientClientId(Long clientId);
}
