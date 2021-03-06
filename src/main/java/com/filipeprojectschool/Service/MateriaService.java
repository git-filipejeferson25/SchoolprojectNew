package com.filipeprojectschool.Service;

import java.util.List;

import com.filipeprojectschool.DTO.MateriaDto;
import com.filipeprojectschool.Entity.MateriaEntity;
import com.filipeprojectschool.Exception.MateriaException;

import java.util.ArrayList;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.filipeprojectschool.Repository.*;

@Service
public class MateriaService implements IMateriaService{

	
	private static final String MENSAGEM_ERRO = "Erro interno identificado. Contate o suporte";
	@SuppressWarnings("unused")
	private static final String MATERIA_NAO_ENCONTRADA = "Matéria não encontrada";
	private IMateriaRepository materiaRepository;
	private ModelMapper mapper;
	
	@Autowired
	public MateriaService(IMateriaRepository materiaRepository) {
		this.mapper = new ModelMapper();
		this.materiaRepository = materiaRepository;
	}


	public Boolean atualizar(MateriaEntity materia) {
		try {
			this.consultar(materia.getId());
			MateriaEntity materiaEntityAtualizada = this.mapper.map(materia,MateriaEntity.class);

			this.materiaRepository.save(materiaEntityAtualizada);

			return Boolean.TRUE;

		}catch (MateriaException m) {
			throw m;
		} catch (Exception e) {
			throw e;
		}
	}

	public Boolean excluir(Long id) {
		try {
			this.consultar(id);
			this.materiaRepository.deleteById(id);
			return Boolean.TRUE;
		} catch (MateriaException m) {
			throw m;
		} catch (Exception e) {
			throw e;
		}
	}


	public List<MateriaDto> listar() {
		try {
			ModelMapper mapper =  new ModelMapper();
			return mapper.map(this.materiaRepository.findAll(),new TypeToken<List<MateriaDto>>() {}.getType());
		} catch (Exception e) {
			return new ArrayList<>();
		}
	}


	public MateriaDto consultar(Long id) {
		try {
			ModelMapper mapper =  new ModelMapper();
			Optional<MateriaEntity> materiaOptional = this.materiaRepository.findById(id);
			if (materiaOptional.isPresent()) {
				return mapper.map(materiaOptional.get(),MateriaDto.class);
			}
			throw new MateriaException("Matéria não encontrada", HttpStatus.NOT_FOUND);
		} catch (MateriaException m) {
			throw m;
		} catch (Exception e) {
			throw new MateriaException("Erro interno identificado. Contate o suporte",
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


	public Boolean cadastrar(MateriaDto materia) {
		try {
			MateriaEntity materiaEnt = this.mapper.map(materia,MateriaEntity.class);
			this.materiaRepository.save(materiaEnt);
			return Boolean.TRUE;
		} catch (Exception e) {
			throw new MateriaException(MENSAGEM_ERRO,
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


	@Override
	public Boolean atualizar(MateriaDto materia) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<MateriaDto> listarPorHorarioMinimo(int horaMinima) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<MateriaDto> listarPorFrequencia(int frequencia) {
		// TODO Auto-generated method stub
		return null;
	}
	}


