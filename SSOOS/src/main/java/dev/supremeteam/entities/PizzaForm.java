package dev.supremeteam.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;

public class PizzaForm {
	
	private String type;
	private String size;
	private double cost;
	private Set<String> toppingNames = new HashSet<String>();
	
	public PizzaForm() {
		super();
	}

	public PizzaForm(String type, String size, double cost, Set<String> toppingNames) {
		super();
		this.type = type;
		this.size = size;
		this.cost = cost;
		this.toppingNames = toppingNames;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Set<String> getToppingNames() {
		return toppingNames;
	}

	public void setToppingNames(Set<String> toppingNames) {
		this.toppingNames = toppingNames;
	}

	@Override
	public String toString() {
		return "PizzaForm [type=" + type + ", size=" + size + ", toppingNames=" + toppingNames + "]";
	}
	
	

}
