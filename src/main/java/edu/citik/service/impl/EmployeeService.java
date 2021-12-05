package edu.citik.service.impl;

import edu.citik.domain.EmployeeMapper;
import edu.citik.domain.dto.EmployeeDto;
import edu.citik.domain.entity.Employee;
import edu.citik.repository.impl.EmployeeRepositoryImpl;
import edu.citik.service.BackendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService implements BackendService<EmployeeDto> {
	private static final String ID = "id";

	@Autowired
	private EmployeeRepositoryImpl repository;
	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	public EmployeeDto create(EmployeeDto employeeDto) {
		Employee newEmployee = employeeMapper.mapToEntity(employeeDto);
		Employee createdEmployee = repository.create(newEmployee);
		return employeeMapper.mapToDto(createdEmployee);
	}

	@Override
	public EmployeeDto findById(String id) {
		Employee employee = repository.find(ID, id);
		return employeeMapper.mapToDto(employee);
	}

	@Override
	public EmployeeDto findByCriteria(String criteria, String value) {
		Employee employee = repository.find(criteria, value);
		return employeeMapper.mapToDto(employee);
	}

	@Override
	public List<EmployeeDto> findAll() {
		List<Employee> employees = repository.findAll();
		return employees.stream()
				.map(employee -> employeeMapper.mapToDto(employee))
				.collect(Collectors.toList());
	}

	@Override
	public Long updateById(String id, String updateCriteria, String updateValue) {
		return repository.update(ID, id, updateCriteria, updateValue);
	}

	@Override
	public Long updateByCriteria(String criteria, String value, String updateCriteria, String updateValue) {
		return repository.update(criteria, value, updateCriteria, updateValue);
	}

	@Override
	public Long removeById(String id) {
		return repository.remove(ID, id);
	}

	@Override
	public Long removeByCriteria(String criteria, String value) {
		return repository.remove(criteria, value);
	}
}
