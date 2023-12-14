package com.exam.vakho_baratashvili.service;

import com.exam.vakho_baratashvili.dto.FlightDTO;
import com.exam.vakho_baratashvili.dto.TicketDTO;
import com.exam.vakho_baratashvili.entity.City;
import com.exam.vakho_baratashvili.entity.Flight;
import com.exam.vakho_baratashvili.entity.Ticket;
import com.exam.vakho_baratashvili.repository.CityRepository;
import com.exam.vakho_baratashvili.repository.FlightRepository;
import com.exam.vakho_baratashvili.repository.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@AllArgsConstructor
@Service
public class FlightServiceImpl implements FlightService{

    private final FlightRepository flightRepository;
    private final TicketRepository ticketRepository;


    public Flight addFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    public List<FlightDTO> getAllFlightsWithCityNames() {
        return flightRepository.getAllFlightsWithCityNames();
    }

    public FlightTicketStats getFlightTicketStatsForCurrentMonth() {
        LocalDate currentDate = LocalDate.now();
        int currentMonth = currentDate.getMonthValue();
        int flightsScheduled = flightRepository.countFlightsScheduledForMonth(currentMonth);
        int ticketsSold = ticketRepository.countTicketsSoldForMonth(currentMonth);
        return new FlightTicketStats(flightsScheduled, ticketsSold);
    }

}
