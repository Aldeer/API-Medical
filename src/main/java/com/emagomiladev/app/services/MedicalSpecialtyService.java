package com.emagomiladev.app.services;

import java.util.List;

import com.emagomiladev.app.dto.MedicalSpecialtyDTO;

public interface MedicalSpecialtyService {
	
	public MedicalSpecialtyDTO newMedicalSpecialty(MedicalSpecialtyDTO medicalSpecialtyDTO);
	
	public List<MedicalSpecialtyDTO> getAllSpecialties();
}
