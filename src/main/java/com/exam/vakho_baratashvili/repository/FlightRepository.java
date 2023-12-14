package com.exam.vakho_baratashvili.repository;

import com.exam.vakho_baratashvili.dto.FlightDTO;
import com.exam.vakho_baratashvili.entity.City;
import com.exam.vakho_baratashvili.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.Month;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {

    List<Flight> getFlightsByFrom(City from);

    @Query("SELECT COUNT(f) FROM Flight f WHERE MONTH(f.createdDate) = :month")
    int countFlightsScheduledForMonth(@Param("month") int currentMonth);

    @Query("SELECT FlightDTO(f.id, f.from.name, f.destination.name) FROM Flight f")
    List<FlightDTO> getAllFlightsWithCityNames();
}
