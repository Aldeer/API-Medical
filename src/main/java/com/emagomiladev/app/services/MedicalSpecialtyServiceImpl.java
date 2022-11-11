package com.emagomiladev.app.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emagomiladev.app.dto.MedicalSpecialtyDTO;
import com.emagomiladev.app.entities.MedicalSpecialty;
import com.emagomiladev.app.repositories.MedicalSpecialtyRepository;
import com.emagomiladev.app.wrappers.MedicalSpecialtyWrapper;

@Service
public class MedicalSpecialtyServiceImpl implements MedicalSpecialtyService {

	@Autowired
	private MedicalSpecialtyRepository medicalSpecialtyRepository;

	@Override
	public MedicalSpecialtyDTO newMedicalSpecialty(MedicalSpecialtyDTO medicalSpecialtyDTO) {
		MedicalSpecialty request = MedicalSpecialtyWrapper.dtoToEntity(medicalSpecialtyDTO);
		MedicalSpecialty saveRequest = medicalSpecialtyRepository.save(request);
		MedicalSpecialtyDTO response = MedicalSpecialtyWrapper.entityToDto(saveRequest);
		return response;
	}

	@Override
	public List<MedicalSpecialtyDTO> getAllSpecialties() {
		List<MedicalSpecialty> specialties = medicalSpecialtyRepository.findAll();
		List<MedicalSpecialtyDTO> dtos = specialties.stream()
				.map(specialty -> MedicalSpecialtyWrapper.entityToDto(specialty)).collect(Collectors.toList());
		return dtos;
	}

}
