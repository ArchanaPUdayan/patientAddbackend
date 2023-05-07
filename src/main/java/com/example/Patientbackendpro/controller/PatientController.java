package com.example.Patientbackendpro.controller;

import com.example.Patientbackendpro.Service.PatientService;
import com.example.Patientbackendpro.Service.PatientServiceimpl;
import com.example.Patientbackendpro.dto.PatientDto;
import com.example.Patientbackendpro.entity.Patient;
import com.example.Patientbackendpro.repository.PatientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PatientController {
    @Autowired
    public PatientDao dao;

    @Autowired
    private PatientService patientService;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public Map<String, String> AddPatient(@RequestBody Patient p) {
    return patientService.AddPatient(p);
    }



    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<PatientDto> ViewAll() {
        return patientService.viewPatients();
    }
}


