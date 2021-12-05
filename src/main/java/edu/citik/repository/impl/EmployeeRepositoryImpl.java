package edu.citik.repository.impl;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import edu.citik.domain.entity.Employee;
import edu.citik.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeRepositoryImpl implements EmployeeRepository {
	@Autowired
	private MongoOperations mongoOperation;

	@Override
	public Employee create(Employee employee) {
		return mongoOperation.save(employee);
	}

	@Override
	public Employee find(String criteria, String value) {
		Query searchEmployee = new Query(Criteria.where(criteria).is(value));
		return mongoOperation.findOne(searchEmployee, Employee.class);
	}

	@Override
	public List<Employee> findAll() {
		return mongoOperation.findAll(Employee.class);
	}

	@Override
	public Long update(String criteria, String value, String updateCriteria, String updateValue) {
		Query searchEmployee = new Query(Criteria.where(criteria).is(value));
		UpdateResult result = mongoOperation.updateFirst(
				searchEmployee,
				Update.update(updateCriteria, updateValue),
				Employee.class);
		return result.getModifiedCount();
	}

	@Override
	public Long remove(String criteria, String value) {
		Query searchEmployee = new Query(Criteria.where(criteria).is(value));
		DeleteResult result = mongoOperation.remove(searchEmployee, Employee.class);
		return result.getDeletedCount();
	}
}