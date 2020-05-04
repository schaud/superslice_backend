package dev.supremeteam.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;

public class OrderForm {
	
	private String username;
	private String note;
	private Set<PizzaForm> pizzaForms = new HashSet<PizzaForm>();
	
	public OrderForm() {
		super();
	}

	public OrderForm(String username, String note, Set<PizzaForm> pizzaForms) {
		super();
		this.username = username;
		this.note = note;
		this.pizzaForms = pizzaForms;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Set<PizzaForm> getPizzaForms() {
		return pizzaForms;
	}

	public void setPizzaForms(Set<PizzaForm> pizzaForms) {
		this.pizzaForms = pizzaForms;
	}

	@Override
	public String toString() {
		return "OrderForm [username=" + username + ", note=" + note + ", pizzaForms=" + pizzaForms + "]";
	}
	
	

}
