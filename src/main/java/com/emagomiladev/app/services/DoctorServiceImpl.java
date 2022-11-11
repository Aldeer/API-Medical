package com.emagomiladev.app.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emagomiladev.app.dto.DoctorDTO;
import com.emagomiladev.app.entities.Doctor;
import com.emagomiladev.app.repositories.DoctorRepository;
import com.emagomiladev.app.repositories.MedicalSpecialtyRepository;
import com.emagomiladev.app.wrappers.DoctorWrapper;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private MedicalSpecialtyRepository medicalSpecialtyRepository;
	
	@Override
	public DoctorDTO newDoctor(DoctorDTO doctorDTO) {
		Doctor request = DoctorWrapper.DtoToEntity(doctorDTO);
		
		Doctor saveDoctor = doctorRepository.save(request);
		DoctorDTO response = DoctorWrapper.entityToDto(saveDoctor);
		return response;
	}

	@Override
	public List<DoctorDTO> getAllDoctors() {
		List<Doctor> doctors = doctorRepository.findAll();
		List<DoctorDTO> response = doctors.stream().map(doctor -> DoctorWrapper.entityToDto(doctor))
				.collect(Collectors.toList());
		return response;
	}

}
