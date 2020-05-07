package dev.supremeteam.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;

public class OrderForm {
	
	private String username;
	private String note;
	private List<PizzaForm> pizzaForms = new ArrayList<PizzaForm>();
	
	public OrderForm() {
		super();
	}

	public OrderForm(String username, String note, List<PizzaForm> pizzaForms) {
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

	public List<PizzaForm> getPizzaForms() {
		return pizzaForms;
	}

	public void setPizzaForms(List<PizzaForm> pizzaForms) {
		this.pizzaForms = pizzaForms;
	}

	@Override
	public String toString() {
		return "OrderForm [username=" + username + ", note=" + note + ", pizzaForms=" + pizzaForms + "]";
	}
	
	

}
