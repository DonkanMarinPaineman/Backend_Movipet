package com.back_movipet.back_movipet.repository;

import com.back_movipet.back_movipet.model.Pet;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PetRepository extends MongoRepository<Pet, String> {

    // Listar mascotas por dueño
    List<Pet> findByOwnerId(String ownerId);
}