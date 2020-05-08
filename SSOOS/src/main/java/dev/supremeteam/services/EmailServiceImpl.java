package dev.supremeteam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.supremeteam.entities.EmailUser;
@Component
@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender javamailsender;

	@Override
	public void sendEmailTo(EmailUser user) throws MailException {

		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(user.getEmailAddress());
		mail.setSubject("Hello Mail");
		mail.setText("Hi " + user.getUsername() + " great!");
		javamailsender.send(mail);

	}

}
