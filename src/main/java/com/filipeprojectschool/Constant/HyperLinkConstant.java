package com.filipeprojectschool.Constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HyperLinkConstant {
	
	ATUALIZAR("UPDATE"),
	EXCLUIR("DELETE"),
	LISTAR("GET_ALL"),
	CONSULTAR("GET");
	
	HyperLinkConstant(String string) {
		this.valor = "";
		// TODO Auto-generated constructor stub
	}

	private final String valor;
	
}