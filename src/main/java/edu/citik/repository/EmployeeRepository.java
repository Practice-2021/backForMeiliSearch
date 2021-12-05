package edu.citik.repository;

import edu.citik.domain.entity.Employee;

import java.util.List;

public interface EmployeeRepository {
    Employee find(String value);

    List<Employee> findAll();
}
