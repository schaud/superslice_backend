package dev.supremeteam.entities;

import java.sql.Time;
import java.util.HashSet;
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
	
	@OneToMany(mappedBy="ticket", fetch=FetchType.LAZY)
	private Set<Pizza> pizzas = new HashSet<Pizza>();
	
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

	public Ticket(int ticketId, Time placementTime, String status, String note, Set<Pizza> pizzas, User user) {
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Pizza> getPizzas() {
		return pizzas;
	}

	public void setPizzas(Set<Pizza> pizzas) {
		this.pizzas = pizzas;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", placementTime=" + placementTime + ", status=" + status + ", note="
				+ note + ", user=" + user.getUsername() + "]";
	}
	
	
	
}
