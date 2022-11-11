package com.emagomiladev.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emagomiladev.app.entities.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
