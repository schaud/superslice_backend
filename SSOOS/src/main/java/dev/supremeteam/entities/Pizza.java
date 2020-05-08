package dev.supremeteam.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	
	@Column(name="pizza_type")
	private String type;
	
	@ManyToMany
	@JoinTable(name="pizza_topping",
	joinColumns = {@JoinColumn(name="pt_pizza")},
	inverseJoinColumns = {@JoinColumn(name="pt_topping")})
	
	private List<Topping> toppings = new ArrayList<Topping>();
	
//	private int cost = 0;

	public Pizza() {
		super();
	}

	public Pizza(int pizzaId, Ticket ticket, List<Topping> toppings) {
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
	@JsonIgnoreProperties({ "pizzas" })
	public List<Topping> getToppings() {
		return toppings;
	}
	@JsonIgnoreProperties({ "pizzas" })
	public void setToppings(List<Topping> toppings) {
		this.toppings = toppings;
//		this.cost = 0;
//		for (Topping topping: toppings) {
//			if (topping != null)
//				this.cost += topping.getCost();
//		}
	}

//	public int getCost() {
//		return cost;
//	}
//
//	public void setCost(int cost) {
//		this.cost = cost;
//	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Pizza [pizzaId=" + pizzaId + ", toppings=" + toppings + ", pizza type="+ type +"]";
	}
	
	
	

}