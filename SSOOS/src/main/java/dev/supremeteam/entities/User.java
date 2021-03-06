package dev.supremeteam.entities;

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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="usr")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@ManyToOne
	@JoinColumn(name="role_id")
	private UserRole userRole;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Ticket> tickets = new ArrayList<Ticket>();

	public User() {
		super();
	}

	public User(int userId, String username, String password, UserRole userRole) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.userRole = userRole;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@JsonIgnoreProperties({ "users" })
	public UserRole getUserRole() {
		
		return userRole;
	}
	@JsonIgnoreProperties({ "users" })
	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}
	@JsonIgnoreProperties({ "pizzas","user"  })
	public List<Ticket> getTickets() {
		return tickets;
	}
	@JsonIgnoreProperties({ "pizzas","user" })
	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password +"]";
	}

	
	
}
