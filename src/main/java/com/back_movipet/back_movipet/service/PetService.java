package com.back_movipet.back_movipet.service;

import com.back_movipet.back_movipet.model.Pet;
import com.back_movipet.back_movipet.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    private final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<Pet> getAll(String ownerId) {
        if (ownerId != null) {
            return petRepository.findByOwnerId(ownerId);
        }
        return petRepository.findAll();
    }

    public Pet create(Pet pet) {
        return petRepository.save(pet);
    }
}
