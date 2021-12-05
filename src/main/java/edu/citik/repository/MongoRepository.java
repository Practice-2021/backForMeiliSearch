package edu.citik.repository;

import java.util.List;

public interface MongoRepository<Entity> {
	Entity create(Entity entity);

	Entity find(String criteria, String value);

	List<Entity> findAll();

	Long update(String criteria, String value, String updateCriteria, String updateValue);

	Long remove(String criteria, String value);
}
