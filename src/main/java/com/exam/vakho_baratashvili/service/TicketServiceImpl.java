package com.exam.vakho_baratashvili.service;

import com.exam.vakho_baratashvili.dto.TicketDTO;
import com.exam.vakho_baratashvili.entity.Ticket;
import com.exam.vakho_baratashvili.repository.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TicketServiceImpl implements TicketService{
    private final TicketRepository ticketRepository;

    @Override
    public Ticket buyTicket(Ticket ticket) {
        return null;
    }

    @Override
    public List<TicketDTO> getAllTicketsOnFlightWithCityNames(Long flightId) {
        return null;
    }

    @Override
    public List<Ticket> getAllTicketsByPassenger(String passengerName) {
        return ticketRepository.findAllByPassengerName(passengerName);
    }
}
