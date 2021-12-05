package edu.citik.service;

import java.util.List;

public interface BackendService<DTO> {
	DTO create(DTO DTO);

	DTO findById(String id);

	DTO findByCriteria(String criteria, String value);

	List<DTO> findAll();

	Long updateById(String id, String updateCriteria, String updateValue);

	Long updateByCriteria(String criteria, String value,
						  String updateCriteria, String updateValue);

	Long removeById(String id);

	Long removeByCriteria(String criteria, String value);
}
