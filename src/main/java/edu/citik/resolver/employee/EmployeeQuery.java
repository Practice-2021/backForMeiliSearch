package edu.citik.resolver.employee;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import edu.citik.domain.dto.EmployeeDto;
import edu.citik.service.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeQuery implements GraphQLQueryResolver {
	@Autowired
	private EmployeeService employeeService;

	public List<EmployeeDto> getEmployees() {
		return employeeService.findAll();
	}

	public EmployeeDto getEmployeeById(String id) {
		return employeeService.findById(id);
	}

	public EmployeeDto getEmployeeByCriteria(String criteria, String value) {
		return employeeService.findByCriteria(criteria, value);
	}
}
