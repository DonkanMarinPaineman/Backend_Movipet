package com.back_movipet.back_movipet.service;

import com.back_movipet.back_movipet.model.Clinic;
import com.back_movipet.back_movipet.repository.ClinicRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicService {

    private final ClinicRepository clinicRepository;

    public ClinicService(ClinicRepository clinicRepository) {
        this.clinicRepository = clinicRepository;
    }

    public List<Clinic> getAll() {
        return clinicRepository.findAll();
    }

    public Clinic create(Clinic clinic) {
        return clinicRepository.save(clinic);
    }
}
