package edu.citik.resolver.employee;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import edu.citik.domain.dto.EmployeeDto;
import edu.citik.service.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMutation implements GraphQLMutationResolver {
	@Autowired
	private EmployeeService employeeService;

	public EmployeeDto createEmployee(EmployeeDto employee) {
		return employeeService.create(employee);
	}

	public Long updateEmployeeById(String id, String updateCriteria, String updateValue) {
		return employeeService.updateById(id, updateCriteria, updateValue);
	}

	public Long updateEmployeeByCriteria(String criteria, String value, String updateCriteria, String updateValue) {
		return employeeService.updateByCriteria(criteria, value, updateCriteria, updateValue);
	}

	public Long removeEmployeeById(String id) {
		return employeeService.removeById(id);
	}

	public Long removeEmployeeByCriteria(String criteria, String value) {
		return employeeService.removeByCriteria(criteria, value);
	}
}
