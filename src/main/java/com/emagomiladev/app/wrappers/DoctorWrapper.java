package com.emagomiladev.app.wrappers;

import java.util.List;
import java.util.stream.Collectors;

import com.emagomiladev.app.dto.DoctorDTO;
import com.emagomiladev.app.dto.MedicalSpecialtyDTO;
import com.emagomiladev.app.entities.Doctor;
import com.emagomiladev.app.entities.MedicalSpecialty;

public class DoctorWrapper {

	public static DoctorDTO entityToDto(Doctor doctor) {
		DoctorDTO doctorDTO = new DoctorDTO();

		doctorDTO.setId(doctor.getId());
		doctorDTO.setName(doctor.getName());
		doctorDTO.setSurname(doctor.getSurname());
		List<MedicalSpecialtyDTO> specialties = doctor.getMedicalSpecialties().stream()
				.map(specialty -> MedicalSpecialtyWrapper.entityToDto(specialty)).collect(Collectors.toList());

		doctorDTO.setMedicalSpecialties(specialties);

		return doctorDTO;
	}

	public static Doctor DtoToEntity(DoctorDTO doctorDTO) {
		Doctor doctor = new Doctor();

		doctor.setName(doctorDTO.getName());
		doctor.setSurname(doctorDTO.getSurname());
		List<MedicalSpecialty> specialties = doctorDTO.getMedicalSpecialties().stream()
				.map(specialty -> MedicalSpecialtyWrapper.dtoToEntity(specialty)).collect(Collectors.toList());
		doctor.setMedicalSpecialties(specialties);

		return doctor;
	}
}
