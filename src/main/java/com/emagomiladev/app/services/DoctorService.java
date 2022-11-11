package com.emagomiladev.app.services;

import java.util.List;

import com.emagomiladev.app.dto.DoctorDTO;

public interface DoctorService {

	public DoctorDTO newDoctor(DoctorDTO doctorDTO);

	public List<DoctorDTO> getAllDoctors();
}
