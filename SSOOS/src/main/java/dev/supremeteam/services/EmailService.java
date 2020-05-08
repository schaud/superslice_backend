package dev.supremeteam.services;

import org.springframework.mail.MailException;

import dev.supremeteam.entities.EmailUser;

public interface EmailService {
	
	
	public EmailUser sendEmailTo(EmailUser user) throws MailException;
	public EmailUser createEmail(EmailUser user);
}
