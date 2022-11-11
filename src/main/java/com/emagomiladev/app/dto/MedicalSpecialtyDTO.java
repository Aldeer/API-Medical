package com.emagomiladev.app.dto;

import java.io.Serializable;

public class MedicalSpecialtyDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String specialty;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

}
