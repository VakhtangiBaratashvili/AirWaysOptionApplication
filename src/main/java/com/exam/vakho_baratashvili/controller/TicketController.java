package com.exam.vakho_baratashvili.controller;

import com.exam.vakho_baratashvili.entity.Ticket;
import com.exam.vakho_baratashvili.service.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/tickets")
public class TicketController {


    private TicketService service;

    @PostMapping
    public Ticket buyTicket(@RequestBody Ticket ticket) {
        return service.buyTicket(ticket);
    }

    @GetMapping("/{passengerName}")
    public List<Ticket> getAllTicketsByPassenger(@PathVariable String passengerName) {
        return service.getAllTicketsByPassenger(passengerName);
    }
}
