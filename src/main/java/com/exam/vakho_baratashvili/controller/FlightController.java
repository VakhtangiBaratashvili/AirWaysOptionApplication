package com.exam.vakho_baratashvili.controller;


import com.exam.vakho_baratashvili.dto.FlightDTO;
import com.exam.vakho_baratashvili.entity.Flight;
import com.exam.vakho_baratashvili.service.FlightService;
import com.exam.vakho_baratashvili.service.FlightTicketStats;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/flights")
public class FlightController {

    private final FlightService service;

    @PostMapping
    public Flight addFlight(@RequestBody Flight flight) {
        return service.addFlight(flight);
    }

    @GetMapping
    public List<FlightDTO> getAllFlightsWithCityNames() {
        return service.getAllFlightsWithCityNames();
    }

    @GetMapping("/stats")
    public FlightTicketStats getFlightTicketStatsForCurrentMonth() {
        return service.getFlightTicketStatsForCurrentMonth();
    }
}
