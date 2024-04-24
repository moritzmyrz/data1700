package com.example.spring1700.controller;

import com.example.spring1700.model.Ticket;
import com.example.spring1700.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;

    @PostMapping
    public Ticket addTicket(@RequestBody Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @GetMapping
    public List<Ticket> getTickets() {
        return ticketRepository.findAll(Sort.by(Sort.Direction.ASC, "lastName"));
    }

    @DeleteMapping
    public void deleteTickets() {
        ticketRepository.deleteAll();
    }
}
