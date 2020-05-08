package dev.supremeteam.entities;

public class EmailUser {

	private String username;
	private String emailAddress;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "EmailUser [username=" + username + ", emailAddress=" + emailAddress + "]";
	}

}
