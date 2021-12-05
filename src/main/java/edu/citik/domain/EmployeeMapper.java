package edu.citik.domain;

import edu.citik.domain.dto.EmployeeDto;
import edu.citik.domain.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

	public Employee mapToEntity(EmployeeDto employeeDto) {
		return Employee.builder()
				.id(employeeDto.getId())
				.firstName(employeeDto.getFirstName())
				.lastName(employeeDto.getLastName())
				.middleName(employeeDto.getMiddleName())
				.photo(employeeDto.getPhoto())
				.positions(employeeDto.getPositions())
				.academicDegree(employeeDto.getAcademicDegree())
				.department(employeeDto.getDepartment())
				.email(employeeDto.getEmail())
				.pureLink(employeeDto.getPureLink())
				.timetable(employeeDto.getTimetable())
				.subjects(employeeDto.getSubjects())
				.educationLevel(employeeDto.getEducationLevel())
				.qualification(employeeDto.getQualification())
				.speciality(employeeDto.getSpeciality())
				.retraining(employeeDto.getRetraining())
				.experience(employeeDto.getExperience())
				.professionalExperience(employeeDto.getProfessionalExperience())
				.projects(employeeDto.getProjects())
				.publications(employeeDto.getPublications())
				.grants(employeeDto.getGrants())
				.build();
	}

	public EmployeeDto mapToDto(Employee employee) {
		return EmployeeDto.builder()
				.id(employee.getId())
				.firstName(employee.getFirstName())
				.lastName(employee.getLastName())
				.middleName(employee.getMiddleName())
				.photo(employee.getPhoto())
				.positions(employee.getPositions())
				.academicDegree(employee.getAcademicDegree())
				.department(employee.getDepartment())
				.email(employee.getEmail())
				.pureLink(employee.getPureLink())
				.timetable(employee.getTimetable())
				.subjects(employee.getSubjects())
				.educationLevel(employee.getEducationLevel())
				.qualification(employee.getQualification())
				.speciality(employee.getSpeciality())
				.retraining(employee.getRetraining())
				.experience(employee.getExperience())
				.professionalExperience(employee.getProfessionalExperience())
				.projects(employee.getProjects())
				.publications(employee.getPublications())
				.grants(employee.getGrants())
				.build();
	}
}
