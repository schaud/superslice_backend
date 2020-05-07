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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.JoinColumn;

@Entity
@Table(name="topping")
public class Topping {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="topping_id")
	private int toppingId;
	
	@Column(name="topping_name")
	private String toppingName;
	
	@Column(name="topping_cost")
	private float cost;
	
	@ManyToMany(mappedBy="toppings")
	private List<Pizza> pizzas = new ArrayList<Pizza>();

	public Topping() {
		super();
	}

	public Topping(int toppingId, String toppingName, float cost) {
		super();
		this.toppingId = toppingId;
		this.toppingName = toppingName;
		this.cost = cost;
	}

	public int getToppingId() {
		return toppingId;
	}

	public void setToppingId(int toppingId) {
		this.toppingId = toppingId;
	}

	public String getToppingName() {
		return toppingName;
	}

	public void setToppingName(String toppingName) {
		this.toppingName = toppingName;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	@JsonIgnoreProperties({ "ticket","toppings","pizzas" })
	public List<Pizza> getPizzas() {
		return pizzas;
	}
	@JsonIgnoreProperties({ "ticket","toppings" })
	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}

	@Override
	public String toString() {
		return "Topping [toppingId=" + toppingId + ", toppingName=" + toppingName + ", cost=" + cost + "]";
	}

}
