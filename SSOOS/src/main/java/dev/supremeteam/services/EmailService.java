package dev.supremeteam.services;

import org.springframework.mail.MailException;

import dev.supremeteam.entities.EmailUser;

public interface EmailService {
	
	
	public void sendEmailTo(EmailUser user) throws MailException;
}
