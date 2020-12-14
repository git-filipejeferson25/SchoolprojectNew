package com.filipeprojectschool.Model;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CourseModel {

	private Long idCourse;
	
	@NotBlank(message = "nome deve ser preenchido")
	@Size(min = 10, max = 30)
	private String nameCourse;
	
	@NotBlank(message = "código deve ser preenchido")
	@Size(min = 2, max = 5)
	private String codCourse;
	
	private List<Long> matery;
	
	
	public Long getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(Long idCourse) {
		this.idCourse = idCourse;
	}

	public List<Long> getMatery() {
		return matery;
	}

	public void setMatery(List<Long> matery) {
		this.matery = matery;
	}

}
