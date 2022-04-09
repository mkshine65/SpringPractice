package com.example.springmailer;

import com.example.springmailer.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.mail.MessagingException;

@SpringBootApplication
@EnableScheduling
public class SpringmailerApplication {


	public static void main(String[] args) {


		SpringApplication.run(SpringmailerApplication.class, args);

	}

	/*@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {

		*//*service.sendEmailWithAttachment("spring.email.to@gmail.com",
				"This is Email Body with Attachment...",
				"This email has attachment",
				"C:\\Users\\shabb\\Pictures\\c.gif");*//*

		service.sendSimpleEmail("mkshine65@gmail.com","Test Message","Mailer Test");

	}*/


}
