package com.back_movipet.back_movipet.repository;

import com.back_movipet.back_movipet.model.Trip;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TripRepository extends MongoRepository<Trip, String> {

    //List<Trip> findByUserIdOrderByTimestampDesc(String userId);
}
