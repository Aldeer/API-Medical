package com.emagomiladev.app.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "medical_specialties")
public class MedicalSpecialty implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(unique = true)
	private String specialty;

	@ManyToMany(mappedBy = "medicalSpecialties")
	private List<Doctor> doctors;

	public MedicalSpecialty() {
		super();
	}

	public MedicalSpecialty(long id, String specialty, List<Doctor> doctors) {
		super();
		this.id = id;
		this.specialty = specialty;
		this.doctors = doctors;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

}
