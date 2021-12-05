package edu.citik.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
	@JsonProperty(value = "id")
	private String id;

	@JsonProperty(value = "firstName")
	private String firstName;

	@JsonProperty(value = "lastName")
	private String lastName;

	@JsonProperty(value = "middleName")
	private String middleName;

	@JsonProperty(value = "photo")
	private String photo;

	@JsonProperty(value = "positions")
	private List<String> positions;

	@JsonProperty(value = "academicDegree")
	private String academicDegree;

	@JsonProperty(value = "department")
	private String department;

	@JsonProperty(value = "email")
	private String email;

	@JsonProperty(value = "pureLink")
	private String pureLink;

	@JsonProperty(value = "timetable")
	private String timetable;

	@JsonProperty(value = "subjects")
	private List<String> subjects;

	@JsonProperty(value = "educationLevel")
	private String educationLevel;

	@JsonProperty(value = "qualification")
	private String qualification;

	@JsonProperty(value = "speciality")
	private String speciality;

	@JsonProperty(value = "retraining")
	private List<String> retraining;

	@JsonProperty(value = "experience")
	private Integer experience;

	@JsonProperty(value = "professionalExperience")
	private Integer professionalExperience;

	@JsonProperty(value = "projects")
	private List<String> projects;

	@JsonProperty(value = "publications")
	private List<String> publications;

	@JsonProperty(value = "grants")
	private List<String> grants;

	@JsonProperty(value = "biography")
	private String biography;

	@JsonProperty(value = "requests")
	private List<String> requests;

	@JsonProperty(value = "department_link")
	private String departmentLink;
}
