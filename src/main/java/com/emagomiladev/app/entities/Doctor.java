package com.emagomiladev.app.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "doctors")
public class Doctor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String surname;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<MedicalSpecialty> medicalSpecialties;

	public Doctor() {
		super();
	}

	public Doctor(Long id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<MedicalSpecialty> getMedicalSpecialties() {
		return medicalSpecialties;
	}

	public void setMedicalSpecialties(List<MedicalSpecialty> medicalSpecialties) {
		this.medicalSpecialties = medicalSpecialties;
	}

}
