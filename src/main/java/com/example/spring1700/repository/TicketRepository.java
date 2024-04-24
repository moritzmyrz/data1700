package com.example.spring1700.repository;

import com.example.spring1700.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    // Custom database queries can be defined here
}
