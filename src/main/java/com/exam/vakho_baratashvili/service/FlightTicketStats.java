package com.exam.vakho_baratashvili.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FlightTicketStats {

    private int flightsScheduled;
    private int ticketsSold;
}
