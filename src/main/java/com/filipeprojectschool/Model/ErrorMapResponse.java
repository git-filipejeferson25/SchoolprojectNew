package com.filipeprojectschool.Model;

import java.util.Map;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
@Getter
@Data
public class ErrorMapResponse {

	
	private int httpStatus;
	private Map<String, String> erros;
	private Long timesTamp;
	
	
	
	public int getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(int httpStatus) {
		this.httpStatus = httpStatus;
	}
	public Map<String, String> getErros() {
		return erros;
	}
	public void setErros(Map<String, String> erros) {
		this.erros = erros;
	}
	public Long getTimesTamp() {
		return timesTamp;
	}
	public void setTimesTamp(Long timesTamp) {
		this.timesTamp = timesTamp;
	}
	public static ErrorMapResponse Builder() {
		// TODO Auto-generated method stub
		return null;
	}
	public static ErrorMapResponse builder() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object erros(Map<String, String> erros2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
