package edu.citik.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private String id;

	private String firstName;

	private String lastName;

	private String middleName;

	private String photo;

	private List<String> positions;

	private String academicDegree;

	private String department;

	private String email;

	private String pureLink;

	private String timetable;

	private List<String> subjects;

	private String educationLevel;

	private String qualification;

	private String speciality;

	private List<String> retraining;

	private Integer experience;

	private Integer professionalExperience;

	private List<String> projects;

	private List<String> publications;

	private List<String> grants;

	private String biography;

	private List<String> requests;

	private String departmentLink;
}
