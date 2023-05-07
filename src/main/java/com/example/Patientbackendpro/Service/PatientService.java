package com.example.Patientbackendpro.Service;

import com.example.Patientbackendpro.dto.PatientDto;
import com.example.Patientbackendpro.entity.Patient;

import java.util.List;
import java.util.Map;

public interface PatientService {

    public List<PatientDto> viewPatients();
    public Map<String, String> AddPatient(Patient P);
}
