package com.emagomiladev.app.services;

import java.util.List;

import com.emagomiladev.app.dto.PatientDTO;

public interface PatientService {

	public PatientDTO newPatient(PatientDTO patientDTO);

	public List<PatientDTO> getAllPatients();
}
