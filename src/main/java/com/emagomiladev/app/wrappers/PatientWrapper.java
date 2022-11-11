package com.emagomiladev.app.wrappers;

import com.emagomiladev.app.dto.PatientDTO;
import com.emagomiladev.app.entities.Patient;

public class PatientWrapper {

	public static Patient dtoToEntity(PatientDTO patientDTO) {
		Patient patient = new Patient();

		patient.setName(patientDTO.getName());
		patient.setSurname(patientDTO.getSurname());
		patient.setDni(patientDTO.getDni());
		patient.setBirthday(patientDTO.getBirthday());
		patient.setHealthInsurance(patientDTO.getHealtInsurance());

		return patient;
	}

	public static PatientDTO entityToDto(Patient patient) {
		PatientDTO patientDTO = new PatientDTO();

		patientDTO.setId(patient.getId());
		patientDTO.setName(patient.getName());
		patientDTO.setSurname(patient.getSurname());
		patientDTO.setDni(patient.getDni());
		patientDTO.setBirthday(patient.getBirthday());
		patientDTO.setHealthInsurance(patient.getHealthInsurance());

		return patientDTO;
	}
}
