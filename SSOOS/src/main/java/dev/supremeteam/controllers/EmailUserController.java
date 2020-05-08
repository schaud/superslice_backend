package dev.supremeteam.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dev.supremeteam.entities.EmailUser;
import dev.supremeteam.entities.User;
import dev.supremeteam.services.EmailService;

@Component
@Controller
@CrossOrigin("*")
public class EmailUserController {

	@Autowired
	EmailService emailserv;

	private static Logger LOGGER = LoggerFactory.getLogger(EmailUserController.class);

//	@GetMapping("/send")
	@ResponseBody
	@RequestMapping(value = "/send", method = RequestMethod.GET)
	public String sendMail() {
		EmailUser user = new EmailUser();
		user.setUsername("superslicepizzeria");
		user.setEmailAddress("superslicepizzeria@gmail.com");

		try {
			emailserv.sendEmailTo(user);
			return "mail have been send successfully";
		} catch (MailException e) {
			LOGGER.error("Could not send email to " + user.getUsername(), e);
		}
		return "Sorry, Something went wrong.";
	}

}
