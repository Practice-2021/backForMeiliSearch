package edu.citik.service;

import java.util.List;

public interface BackendService<DTO> {

	DTO find(String value);

	List<DTO> findAll();
}
