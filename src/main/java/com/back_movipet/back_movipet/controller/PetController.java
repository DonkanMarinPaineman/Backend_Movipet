package com.back_movipet.back_movipet.controller;

import com.back_movipet.back_movipet.model.Pet;
import com.back_movipet.back_movipet.service.PetService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
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
    public List<Pet> getAll() {
        return petService.getAll();   // sin ownerId
    }

    @PostMapping
    public Pet create(@Valid @RequestBody Pet pet) {
        if (pet.getCreatedAt() == null) {
            pet.setCreatedAt(System.currentTimeMillis());
        }
        return petService.create(pet);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        boolean deleted = petService.deleteById(id);
        if (!deleted) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }
}
