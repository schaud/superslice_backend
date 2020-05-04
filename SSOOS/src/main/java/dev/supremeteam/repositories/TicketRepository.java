package dev.supremeteam.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dev.supremeteam.entities.Ticket;

@Component
@Repository
public interface TicketRepository extends CrudRepository<Ticket,Integer>{

	List<Ticket> findByStatusNot(String status);
	List<Ticket> findByStatus(String status);
//	Ticket getTicketByUsername(String name);
}
