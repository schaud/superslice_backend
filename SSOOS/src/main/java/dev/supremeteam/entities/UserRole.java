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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="user_role")
public class UserRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="role_id")
	private int roleId;
	
	@Column(name="role_title")
	private String roleTitle;
	
	@OneToMany(mappedBy = "userRole", fetch = FetchType.LAZY)
	private List<User> users = new ArrayList<User>();
	
	public List<User> getUsers() {
		return users;
	}
	
	public void setUsers(List<User> users) {
		this.users = users;
	}

	public UserRole() {
		super();
	}

	public UserRole(int roleId, String roleTitle) {
		super();
		this.roleId = roleId;
		this.roleTitle = roleTitle;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleTitle() {
		return roleTitle;
	}

	public void setRoleTitle(String roleTitle) {
		this.roleTitle = roleTitle;
	}

	@Override
	public String toString() {
		return "UserRole [roleId=" + roleId + ", roleTitle=" + roleTitle + "]";
	}
	
	

}
