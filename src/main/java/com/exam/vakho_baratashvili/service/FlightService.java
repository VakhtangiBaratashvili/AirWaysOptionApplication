package com.exam.vakho_baratashvili.service;

import com.exam.vakho_baratashvili.dto.FlightDTO;
import com.exam.vakho_baratashvili.entity.Flight;

import java.util.List;

public interface FlightService {
    Flight addFlight(Flight flight);
    List<FlightDTO> getAllFlightsWithCityNames();
    FlightTicketStats getFlightTicketStatsForCurrentMonth();
}
