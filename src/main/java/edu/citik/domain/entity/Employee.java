package edu.citik.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "employee")
public class Employee {

	@Id
	private String id;

	@Field(value = "first_name")
	private String firstName;

	@Field(value = "last_name")
	private String lastName;

	@Field(value = "middle_name")
	private String middleName;

	@Field(value = "photo")
	private String photo;

	@Field(value = "positions")
	private List<String> positions;

	@Field(value = "academic_degree")
	private String academicDegree;

	@Field(value = "department")
	private String department;

	@Field(value = "email")
	private String email;

	@Field(value = "pure_link")
	private String pureLink;

	@Field(value = "timetable")
	private String timetable;

	@Field(value = "subjects")
	private List<String> subjects;

	@Field(value = "education_level")
	private String educationLevel;

	@Field(value = "qualification")
	private String qualification;

	@Field(value = "speciality")
	private String speciality;

	@Field(value = "retraining")
	private List<String> retraining;

	@Field(value = "experience")
	private Integer experience;

	@Field(value = "professional_experience")
	private Integer professionalExperience;

	@Field(value = "projects")
	private List<String> projects;

	@Field(value = "publications")
	private List<String> publications;

	@Field(value = "grants")
	private List<String> grants;

	@Field(value = "biography")
	private String biography;

	@Field(value = "requests")
	private List<String> requests;

	@Field(value = "department_link")
	private String departmentLink;
}
