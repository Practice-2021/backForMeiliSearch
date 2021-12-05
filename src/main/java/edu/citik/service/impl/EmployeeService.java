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
	public EmployeeDto find(String value) {
		Employee employee = repository.find(value);
		return employeeMapper.mapToDto(employee);
	}

	@Override
	public List<EmployeeDto> findAll() {
		List<Employee> employees = repository.findAll();
		return employees.stream()
				.map(employee -> employeeMapper.mapToDto(employee))
				.collect(Collectors.toList());
	}
}
