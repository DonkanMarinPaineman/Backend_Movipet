package com.back_movipet.back_movipet.controller;

import com.back_movipet.back_movipet.model.Pet;
import com.back_movipet.back_movipet.service.PetService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pets")
@CrossOrigin(origins = "*")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping
    public List<Pet> getAll(@RequestParam(required = false) String ownerId) {
        return petService.getAll(ownerId);
    }

    @PostMapping
    public Pet create(@Valid @RequestBody Pet pet) {
        return petService.create(pet);
    }
}
