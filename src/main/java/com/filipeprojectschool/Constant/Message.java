package com.filipeprojectschool.Constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Message {
	
	ERRO_GENERICO("Erro interno identificado. Contate o suporte."),
	ERRO_MATERIA_NAO_ENCONTRADA("Matéria não encontrada."),
	ERRO_MATERIA_CADASTRADA_ANTERIORMENTE("Matéria já possui cadastro."),
	ERRO_CURSO_CADASTRADO_ANTERIORMENTE("curso já possui cadastro."),
	ERRO_CURSO_NAO_ENCONTRADO("Curso não encontrado."),
	ERRO_ID_INFORMADO("ID não pode ser informado na operação de cadastro.");
	
	Message(String string) {
		this.valor = "";
		// TODO Auto-generated constructor stub
	}

	private final String valor;
	
}