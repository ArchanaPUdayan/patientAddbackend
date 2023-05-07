package com.example.Patientbackendpro.repository;

import com.example.Patientbackendpro.dto.PatientDto;
import com.example.Patientbackendpro.entity.Patient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientDao extends CrudRepository<Patient,Integer> {
    @Query(value = "SELECT * FROM `patient`",nativeQuery = true)
    List<PatientDto>viewPatients();

}
