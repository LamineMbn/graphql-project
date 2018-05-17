package com.blog.soat.graphql.repository;

import com.blog.soat.graphql.entities.Mission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface MissionRepository extends CrudRepository<Mission, Long> {

	@Transactional
	Iterable<Mission> findAllByClientClientId(Long clientId);
}
