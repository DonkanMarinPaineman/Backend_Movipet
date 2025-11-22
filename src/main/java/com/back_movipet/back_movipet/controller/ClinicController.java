package com.back_movipet.back_movipet.controller;

import com.back_movipet.back_movipet.model.Clinic;
import com.back_movipet.back_movipet.service.ClinicService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clinics")
@CrossOrigin(origins = "*") // para que la app móvil pueda llamar sin problemas CORS
public class ClinicController {

    private final ClinicService clinicService;

    public ClinicController(ClinicService clinicService) {
        this.clinicService = clinicService;
    }

    @GetMapping
    public List<Clinic> getAll() {
        return clinicService.getAll();
    }

    @PostMapping
    public Clinic create(@Valid @RequestBody Clinic clinic) {
        return clinicService.create(clinic);
    }
}
