package com.back_movipet.back_movipet.repository;

import com.back_movipet.back_movipet.model.Clinic;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClinicRepository extends MongoRepository<Clinic, String> {
}