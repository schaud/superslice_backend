package dev.supremeteam.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pizza")
public class Pizza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pizza_id")
	private int pizzaId;
	
	@ManyToOne
	@JoinColumn(name="ticket_id")
	private Ticket ticket;
	
	@ManyToMany(mappedBy="pizzas")
	private Set<Topping> toppings = new HashSet<Topping>();

	public Pizza() {
		super();
	}

	public Pizza(int pizzaId, Ticket ticket, Set<Topping> toppings) {
		super();
		this.pizzaId = pizzaId;
		this.ticket = ticket;
		this.toppings = toppings;
	}

	public Pizza(int pizzaId, Ticket ticket) {
		super();
		this.pizzaId = pizzaId;
		this.ticket = ticket;
	}

	public int getPizzaId() {
		return pizzaId;
	}

	public void setPizzaId(int pizzaId) {
		this.pizzaId = pizzaId;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Set<Topping> getToppings() {
		return toppings;
	}

	public void setToppings(Set<Topping> toppings) {
		this.toppings = toppings;
	}

	@Override
	public String toString() {
		return "Pizza [pizzaId=" + pizzaId + ", ticket=" + ticket + "]";
	}
	
	

}