package com.filipeprojectschool.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.filipeprojectschool.Entity.CourseEntity;
import com.filipeprojectschool.Model.CourseModel;
import com.filipeprojectschool.Model.Response;
import com.filipeprojectschool.Service.ICourseService;


@RestController
@RequestMapping("/curso")
public class CourseController {

	@Autowired
	private ICourseService courseService;

	/*
	 * Cadastro curso, passando a os códigos das matérias a serem cadastradas
	 */

	@PostMapping
	public ResponseEntity<Response<Boolean>> cadastrarCurso(@Valid @RequestBody CourseModel course) {

		Response<Boolean> response = new Response<>();

		response.setData(courseService.cadastrar(course));
		response.setStatusCode(HttpStatus.OK.value());

		return ResponseEntity.status(HttpStatus.OK).body(response);

	}

	/*
	 * Listar cursos
	 */

	@GetMapping
	public ResponseEntity<Response<List<CourseEntity>>> listarCurso() {
		Response<List<CourseEntity>> response = new Response<>();
		response.setData(this.courseService.listar());
		response.setStatusCode(HttpStatus.OK.value());
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	/*
	 * Consultar curso por código do curso
	 */

	@GetMapping("/{codCurso}")
	public ResponseEntity<Response<CourseEntity>> consultarCursoPorMateria(@PathVariable String codCourse) {
		Response<CourseEntity> response = new Response<>();
		response.setData(this.courseService.consultarPorCodigo(codCourse));
		response.setStatusCode(HttpStatus.OK.value());
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	/*
	 * Atualizar curso
	 */
	@PutMapping
	public ResponseEntity<Response<Boolean>> atualizarCurso(@Valid @RequestBody CourseModel course) {
		Response<Boolean> response = new Response<>();
		response.setData(courseService.atualizar(course));
		response.setStatusCode(HttpStatus.OK.value());

		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	/*
	 * Excluir curso
	 */
	@DeleteMapping("/{cursoId}")
	public ResponseEntity<Response<Boolean>> excluirCurso( @PathVariable Long courseId) {
		Response<Boolean> response = new Response<>();
		response.setData(courseService.excluir(courseId));
		response.setStatusCode(HttpStatus.OK.value());

		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

}
