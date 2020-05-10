package dev.supremeteam.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dev.supremeteam.entities.Ticket;
import dev.supremeteam.entities.User;

@Component
@Repository
public interface TicketRepository extends CrudRepository<Ticket,Integer>{

	List<Ticket> findByStatusNotOrderByPlacementTimeAsc(String status);
	List<Ticket> findByStatusOrderByPlacementTimeAsc(String status);
	List<Ticket> findAllByOrderByPlacementTimeAsc();
	List<Ticket> findByUserOrderByTicketId(User user);
}
