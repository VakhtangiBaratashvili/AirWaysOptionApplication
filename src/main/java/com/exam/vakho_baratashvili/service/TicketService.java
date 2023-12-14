package com.exam.vakho_baratashvili.service;

import com.exam.vakho_baratashvili.dto.TicketDTO;
import com.exam.vakho_baratashvili.entity.Ticket;

import java.util.List;

public interface TicketService {
    Ticket buyTicket(Ticket ticket);
    List<TicketDTO> getAllTicketsOnFlightWithCityNames(Long flightId);
    List<Ticket> getAllTicketsByPassenger(String passengerName);
}
