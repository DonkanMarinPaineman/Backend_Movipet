package com.back_movipet.back_movipet.controller;

import com.back_movipet.back_movipet.model.Trip;
import com.back_movipet.back_movipet.service.TripService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trips")
@CrossOrigin(origins = "*")
public class TripController {

    private final TripService tripService;

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @GetMapping
    public List<Trip> getAll() {
        return tripService.getAll();
    }

    @PostMapping
    public Trip create(@Valid @RequestBody Trip trip) {
        return tripService.create(trip);
    }
}
