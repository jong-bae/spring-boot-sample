package com.sample.web.common.mail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailSenderService {

	@Autowired private JavaMailSender mailSender;
	
	public void sendMail(String subject, String text, String from, String[] toUser) {
		MimeMessage message = mailSender.createMimeMessage(); 
		try{
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
			messageHelper.setSubject(subject);
			messageHelper.setTo(toUser);
			messageHelper.setFrom(from);
			messageHelper.setText(text, true);
			mailSender.send(message);
		}catch(MessagingException e){
			e.printStackTrace();
		}
	}
}
