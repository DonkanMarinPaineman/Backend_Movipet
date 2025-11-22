package com.back_movipet.back_movipet.service;

import com.back_movipet.back_movipet.model.Trip;
import com.back_movipet.back_movipet.repository.TripRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {

    private final TripRepository tripRepository;

    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public List<Trip> getTrips(String userId) {
        if (userId != null) {
            return tripRepository.findByUserIdOrderByTimestampDesc(userId);
        }
        return tripRepository.findAll();
    }

    public Trip create(Trip trip) {
        if (trip.getTimestamp() == null) {
            trip.setTimestamp(System.currentTimeMillis());
        }
        return tripRepository.save(trip);
    }
}
