package com.emagomiladev.app.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emagomiladev.app.dto.PatientDTO;
import com.emagomiladev.app.entities.Patient;
import com.emagomiladev.app.repositories.PatientRepository;
import com.emagomiladev.app.wrappers.PatientWrapper;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepository;

	@Override
	public PatientDTO newPatient(PatientDTO patientDTO) {
		Patient patientRequest = PatientWrapper.dtoToEntity(patientDTO);
		Patient savePatient = patientRepository.save(patientRequest);
		PatientDTO response = PatientWrapper.entityToDto(savePatient);
		return response;
	}

	@Override
	public List<PatientDTO> getAllPatients() {
		List<Patient> patients = patientRepository.findAll();
		List<PatientDTO> patientResponse = patients.stream().map(patient -> PatientWrapper.entityToDto(patient))
				.collect(Collectors.toList());
		return patientResponse;
	}

}
