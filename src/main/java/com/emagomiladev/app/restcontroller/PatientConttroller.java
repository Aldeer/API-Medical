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

import com.emagomiladev.app.dto.PatientDTO;
import com.emagomiladev.app.services.PatientService;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientConttroller {

	@Autowired
	private PatientService patientService;

	@GetMapping
	public ResponseEntity<Map<String, List<PatientDTO>>> getAllPatient() {
		Map<String, List<PatientDTO>> response = new HashMap<>();
		response.put("Patients", patientService.getAllPatients());
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PostMapping("/newPatient")
	public ResponseEntity<Map<String, PatientDTO>> newPatient(@RequestBody PatientDTO patientDTO) {
		Map<String, PatientDTO> response = new HashMap<>();
		PatientDTO newPatientDTO = patientService.newPatient(patientDTO);
		response.put("patient " + newPatientDTO.getId(), newPatientDTO);

		return new ResponseEntity<>(response, HttpStatus.CREATED);

	}
}
