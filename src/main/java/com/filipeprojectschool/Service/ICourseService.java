package com.filipeprojectschool.Service;

import java.util.List;

import javax.validation.Valid;

import com.filipeprojectschool.Entity.CourseEntity;
import com.filipeprojectschool.Model.CourseModel;


public interface ICourseService {

	List<CourseEntity> listar();

	CourseEntity consultarPorCodigo(String codCourse);

	Boolean excluir(Long courseId);

	Boolean atualizar(@Valid CourseModel course);

	Boolean cadastrar(@Valid CourseModel course);





}
