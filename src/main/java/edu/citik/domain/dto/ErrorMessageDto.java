package edu.citik.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessageDto {
	@JsonProperty(value = "full_name")
	private String fullName;

	@JsonProperty(value = "teacherEmail")
	private String teacherEmail;

	@JsonProperty(value = "academicDegree")
	private String academicDegree;

	@JsonProperty(value = "pureLink")
	private String pureLink;

	@JsonProperty(value = "timetable")
	private String timetable;

	@JsonProperty(value = "educationLevel")
	private String educationLevel;

	@JsonProperty(value = "qualification")
	private String qualification;

	@JsonProperty(value = "speciality")
	private String speciality;

	@JsonProperty(value = "experience")
	private Integer experience;

	@JsonProperty(value = "professionalExperience")
	private Integer professionalExperience;

	@JsonProperty(value = "publications")
	private Integer publications;

	@JsonProperty(value = "applications")
	private Integer applications;

	@JsonProperty(value = "grants")
	private Integer grants;

	@JsonProperty(value = "projects")
	private Integer projects;

	@JsonProperty(value = "email")
	private String email;

	@JsonProperty(value = "errorsInfo")
	private String errorsInfo;

	@Override
	public String toString() {
		return "Имя преподавателя: " + fullName + "<br>" +
				"Почта преподавателя: " + teacherEmail + "<br>" +
				"Научная степень: " + academicDegree + "<br>" +
				"Ссылка: " + pureLink + "<br>" +
				"Расписание: " + timetable + "<br>" +
				"Уровень образования: " + educationLevel + "<br>" +
				"Квалификация: " + qualification + "<br>" +
				"Специальность: " + speciality + "<br>" +
				"Общий стаж работы: " + experience + "<br>" +
				"Стаж работы по специальности: " + professionalExperience + "<br>" +
				"Число публикаций: " + publications + "<br>" +
				"Число заявок: " + applications + "<br>" +
				"Число грантов: " + grants + "<br>" +
				"Число проектов: " + projects + "<br>" +
				"Ошибка обнаружена: " + email + "<br>" +
				"Комментарий к ошибке: " + errorsInfo;
	}
}
