package com.filipeprojectschool.Model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ErrorResponse {

	
	private String mensagem;
	private int hhtpStatus;
	private Long timesTamp;
	
	
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public int getHhtpStatus() {
		return hhtpStatus;
	}
	public void setHhtpStatus(int hhtpStatus) {
		this.hhtpStatus = hhtpStatus;
	}
	public Long getTimesTamp() {
		return timesTamp;
	}
	public void setTimesTamp(Long timesTamp) {
		this.timesTamp = timesTamp;
	}
	
	public Object build() {
		// TODO Auto-generated method stub
		return null;
	}
	public static ErrorResponse builder() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
