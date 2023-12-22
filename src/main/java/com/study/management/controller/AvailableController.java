package com.study.management.controller;

import com.study.management.entity.AvailableDate;
import com.study.management.repository.AvailableDateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/available")
public class AvailableController {

    private final AvailableDateRepository availableDateRepository;

    @Autowired
    public AvailableController(AvailableDateRepository availableDateRepository) {
        this.availableDateRepository = availableDateRepository;
    }

    @GetMapping("/dates")
    public List<AvailableDate> getAvailableDates() {
        return availableDateRepository.findAll();
    }

    @GetMapping("/seats")
    public List<Integer> getAvailableSeats(@RequestParam String date) {
        return List.of(1, 3, 5, 7, 9, 11); // Dummy data
    }
}
