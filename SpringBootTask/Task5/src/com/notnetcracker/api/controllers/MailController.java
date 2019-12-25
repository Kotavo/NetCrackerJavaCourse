package com.notnetcracker.api.controllers;

import com.notnetcracker.senderdata.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MailController {

    @Autowired
    public JavaMailSender emailSender;

    @ResponseBody
    @RequestMapping("/sendSimpleEmail")
    public String sendSimpleEmail() {

        // Create a Simple MailMessage.
        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(Sender.RECEIVER_EMAIL);
        message.setSubject("Test Simple Email");
        message.setText("Hello! It's test message");

        // Send Message!
        this.emailSender.send(message);

        return "Email Sent!";
    }


}
