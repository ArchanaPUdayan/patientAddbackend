package com.example.Patientbackendpro.Service;

import com.example.Patientbackendpro.dto.PatientDto;
import com.example.Patientbackendpro.entity.Patient;
import com.example.Patientbackendpro.repository.PatientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PatientServiceimpl implements PatientService{
    @Autowired
    PatientDao patientDao;
    @Override
    public List<PatientDto> viewPatients() {
        return patientDao.viewPatients();
    }


    @Override
    public Map<String, String> AddPatient(Patient P) {
        System.out.println(P.getName());
        System.out.println(P.getDescription());
        System.out.println(P.getEventdata());
        patientDao.save(P);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;

    }
}
