package edu.citik.repository.impl;


import com.meilisearch.sdk.Client;
import com.meilisearch.sdk.model.SearchResult;
import edu.citik.domain.EmployeeMapper;
import edu.citik.domain.entity.Employee;
import edu.citik.repository.EmployeeRepository;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class EmployeeRepositoryImpl implements EmployeeRepository {
	@Autowired
	private Client client;

	@Override
	public Employee find(String value) {
		SearchResult practice = null;
		Employee employee = null;
		try {
			practice = client.index("practice").search(value);
			if (practice.getHits().size() > 0) {
				HashMap<String, Object> stringObjectHashMap = practice.getHits().get(0);
				employee = mapToEmployee(stringObjectHashMap);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public List<Employee> findAll() {
		SearchResult practice = null;
		List<Employee> list = new ArrayList<>();
		try {
			practice = client.index("practice").search("");
			for (Map<String, Object> hit : practice.getHits()) {
				list.add(mapToEmployee(hit));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	private Employee mapToEmployee(Map<String, Object> stringObjectHashMap) {
		Employee employee = null;
		if (stringObjectHashMap != null) {
			employee = new Employee();
			employee.setId(stringObjectHashMap.get("id").toString());
			employee.setFirstName(stringObjectHashMap.get("first_name").toString());
			employee.setLastName(stringObjectHashMap.get("last_name").toString());
			employee.setMiddleName(stringObjectHashMap.get("middle_name").toString());
			employee.setPhoto(stringObjectHashMap.get("photo").toString());
			employee.setAcademicDegree(stringObjectHashMap.get("academic_degree").toString());
			employee.setDepartment(stringObjectHashMap.get("department").toString());
			employee.setEmail(stringObjectHashMap.get("email").toString());
			employee.setPureLink(stringObjectHashMap.get("pure_link").toString());
			employee.setTimetable(stringObjectHashMap.get("timetable").toString());
			employee.setEducationLevel(stringObjectHashMap.get("education_level").toString());
			employee.setQualification(stringObjectHashMap.get("qualification").toString());
			employee.setSpeciality(stringObjectHashMap.get("speciality").toString());
			employee.setExperience(Double.valueOf(stringObjectHashMap.get("experience").toString()).intValue());
			employee.setProfessionalExperience(Double.valueOf(stringObjectHashMap.get("professional_experience").toString()).intValue());
			employee.setPositions((List<String>) (stringObjectHashMap.get("positions")));
			employee.setSubjects((List<String>) (stringObjectHashMap.get("subjects")));
			employee.setRetraining((List<String>) (stringObjectHashMap.get("retraining")));
			employee.setProjects((List<String>) (stringObjectHashMap.get("projects")));
			employee.setPublications((List<String>) (stringObjectHashMap.get("publications")));
			employee.setGrants((List<String>) (stringObjectHashMap.get("grants")));
		}

		return employee;
	}

}