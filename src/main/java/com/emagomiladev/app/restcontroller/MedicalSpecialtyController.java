package com.emagomiladev.app.restcontroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emagomiladev.app.dto.MedicalSpecialtyDTO;
import com.emagomiladev.app.services.MedicalSpecialtyService;

@RestController
@RequestMapping("/api/v1/medicalSpecialty")
public class MedicalSpecialtyController {

	@Autowired
	private MedicalSpecialtyService medicalSpecialtyService;

	@GetMapping("/all")
	public ResponseEntity<Map<String, List<MedicalSpecialtyDTO>>> getAllSpecialties() {
		Map<String, List<MedicalSpecialtyDTO>> response = new HashMap<>();
		List<MedicalSpecialtyDTO> specialties = medicalSpecialtyService.getAllSpecialties();

		response.put("Specialties", specialties);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PostMapping("/newMedicalSpecialty")
	public ResponseEntity<Map<String, MedicalSpecialtyDTO>> newMedicalSpecialty(
			@RequestBody MedicalSpecialtyDTO medicalSpecialtyDTO) {

		Map<String, MedicalSpecialtyDTO> response = new HashMap<>();
		MedicalSpecialtyDTO responseDto = medicalSpecialtyService.newMedicalSpecialty(medicalSpecialtyDTO);

		response.put("Specialty " + responseDto.getId(), responseDto);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
}
