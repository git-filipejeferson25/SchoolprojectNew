package com.filipeprojectschool.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.filipeprojectschool.Entity.CourseEntity;


@Repository
public interface ICourseRepository extends JpaRepository<CourseEntity, Long>{

	@Query("select c from CursoEntity c where c.codigo = :codigo")
	public CourseEntity findCursoByCodigo(@Param("codigo") String codigo);

}