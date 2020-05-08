package dev.supremeteam.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;

public class PizzaForm {
	
	private String type;
	private String size;
	private float cost;
	private int quantity;
	private List<String> toppingNames = new ArrayList<String>();
	
	public PizzaForm() {
		super();
	}

	public PizzaForm(String type, String size, float cost, List<String> toppingNames) {
		super();
		this.type = type;
		this.size = size;
		this.cost = cost;
		this.toppingNames = toppingNames;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public List<String> getToppingNames() {
		return toppingNames;
	}

	public void setToppingNames(List<String> toppingNames) {
		this.toppingNames = toppingNames;
	}

	@Override
	public String toString() {
		return "PizzaForm [type=" + type + ", size=" + size + ", toppingNames=" + toppingNames + "]";
	}
	
	

}
