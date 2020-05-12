package dev.supremeteam.entities;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="ticket")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ticket_id")
	private int ticketId;
	
	@Column(name="placement_time")
	private Time placementTime;
	
	@Column(name="status")
	private String status;
	
	@Column(name="note")
	private String note;
	
	@Column(name="total_cost")
	private float totalCost;
	
	@Column(name="placement_date")
	private Date placementDate;
	
	@OneToMany(mappedBy="ticket", fetch=FetchType.LAZY)
	private List<Pizza> pizzas = new ArrayList<Pizza>();
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public Ticket() {
		super();
	}

	public Ticket(int ticketId, Time placementTime, String status, String note, User user) {
		super();
		this.ticketId = ticketId;
		this.placementTime = placementTime;
		this.status = status;
		this.note = note;
		this.user = user;
	}

	public Ticket(int ticketId, Time placementTime, String status, String note, List<Pizza> pizzas, User user) {
		super();
		this.ticketId = ticketId;
		this.placementTime = placementTime;
		this.status = status;
		this.note = note;
		this.pizzas = pizzas;
		this.user = user;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public Time getPlacementTime() {
		return placementTime;
	}

	public void setPlacementTime(Time placementTime) {
		this.placementTime = placementTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	public Date getPlacementDate() {
		return placementDate;
	}

	public void setPlacementDate(Date placementDate) {
		this.placementDate = placementDate;
	}
	@JsonIgnoreProperties({"password"})
	public User getUser() {
		return user;
	}
	@JsonIgnoreProperties({ "tickets"})
	public void setUser(User user) {
		this.user = user;
	}
	@JsonIgnoreProperties({ "ticket"})
	public List<Pizza> getPizzas() {
		return pizzas;
	}

	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", placementTime=" + placementTime + ", status=" + status + ", note="
				+ note + ", user=" + user.getUsername() + "]";
	}
	
	
	
}
