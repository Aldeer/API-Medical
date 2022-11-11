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

import com.emagomiladev.app.dto.DoctorDTO;
import com.emagomiladev.app.services.DoctorService;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	@GetMapping("/all")
	public ResponseEntity<Map<String, List<DoctorDTO>>> getAllDoctor() {
		Map<String, List<DoctorDTO>> response = new HashMap<>();
		response.put("Doctors", doctorService.getAllDoctors());

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PostMapping("/newDoctor")
	public ResponseEntity<Map<String, DoctorDTO>> newDoctor(@RequestBody DoctorDTO doctorDTO) {
		Map<String, DoctorDTO> response = new HashMap<>();
		DoctorDTO newDoctorDTO = doctorService.newDoctor(doctorDTO);
		response.put("Doctor " + newDoctorDTO.getId(), newDoctorDTO);

		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

}
