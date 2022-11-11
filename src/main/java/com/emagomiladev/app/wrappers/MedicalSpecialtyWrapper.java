package com.emagomiladev.app.wrappers;

import com.emagomiladev.app.dto.MedicalSpecialtyDTO;
import com.emagomiladev.app.entities.MedicalSpecialty;

public class MedicalSpecialtyWrapper {

	public static MedicalSpecialty dtoToEntity(MedicalSpecialtyDTO medicalSpecialtyDTO) {
		MedicalSpecialty medicalSpecialty = new MedicalSpecialty();
		medicalSpecialty.setSpecialty(medicalSpecialtyDTO.getSpecialty());
		return medicalSpecialty;
	}

	public static MedicalSpecialtyDTO entityToDto(MedicalSpecialty medicalSpecialty) {
		MedicalSpecialtyDTO medicalSpecialtyDTO = new MedicalSpecialtyDTO();
		medicalSpecialtyDTO.setId(medicalSpecialty.getId());
		medicalSpecialtyDTO.setSpecialty(medicalSpecialty.getSpecialty());
		return medicalSpecialtyDTO;
	}
}
