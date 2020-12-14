package com.filipeprojectschool.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Tabela Materia")
@NoArgsConstructor
@Data
public class MateriaEntity implements Serializable{

	private static final long serialVersionUID = -4347884940679737637L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonInclude(Include.NON_NULL)
	@Column(name = "ID")
	private Long id;
	
		@JsonInclude(Include.NON_EMPTY)
		@Column(name = "Name")
		private String name;
	
			@Column(name = "Hours")
			private int hour;
	
				@Column(name = "Cod")
				private String codigo;
	
					@Column(name = "Fequency")
					private int frequency;

					
					public Long getId() {
						return id;
					}

					public void setId(Long id) {
						this.id = id;
					}

					public String getName() {
						return name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public int getHour() {
						return hour;
					}

					public void setHour(int hour) {
						this.hour = hour;
					}

					public String getCodigo() {
						return codigo;
					}

					public void setCodigo(String codigo) {
						this.codigo = codigo;
					}

					public int getFrequency() {
						return frequency;
					}

					public void setFrequency(int frequency) {
						this.frequency = frequency;
					}

					public static long getSerialversionuid() {
						return serialVersionUID;
					}
					
	
}
