package dev.supremeteam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.supremeteam.entities.Ticket;
import dev.supremeteam.entities.Topping;
import dev.supremeteam.entities.User;
import dev.supremeteam.repositories.TicketRepository;
import dev.supremeteam.repositories.ToppingRepository;
import dev.supremeteam.repositories.UserRepository;

@Component
@Service
public class ApiServiceImpl implements ApiService{

	@Autowired
	TicketRepository ticketRepo;
	@Autowired
	ToppingRepository toppingRepo;
	@Autowired
	UserRepository userRepo;
	
	@Override
	public List<Ticket> getAllTickets() {
		try { return (List<Ticket>) ticketRepo.findAll();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Ticket> getUserTickets(String username) {
		try { User user = userRepo.findByUsername(username);
		return ticketRepo.findByUserOrderByTicketId(user);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Topping> getAllToppings() {
		try { return (List<Topping>) toppingRepo.findAll(); 
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Topping> getToppingsByPopularity() {
		try { return toppingRepo.findOrderedToppings();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Topping createTopping(Topping topping) {
		try { topping.setToppingId(0);
		return toppingRepo.save(topping);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Topping getToppingById(int id) {
		try { return toppingRepo.findById(id).get();
		
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Topping updateTopping(Topping topping) {
		try { return toppingRepo.save(topping);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean deleteTopping(Topping topping) {
		try { toppingRepo.delete(topping);
		return true; 
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Ticket createTicket(Ticket ticket) {
		try { ticket.setTicketId(0);
		return ticketRepo.save(ticket);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Ticket getTicketById(int id) {
		try { return ticketRepo.findById(id).get();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Ticket updateTicket(Ticket ticket) {
		try { return ticketRepo.save(ticket);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean deleteTicket(Ticket ticket) {
		try { ticketRepo.delete(ticket);
		return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Topping getToppingByName(String name) {
		try { return toppingRepo.findByToppingName(name);
		} catch (Exception e) {
			return null;
		}
	}

}
