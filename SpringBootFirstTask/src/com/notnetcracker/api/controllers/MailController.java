package com.notnetcracker.api.controllers;

import com.notnetcracker.model.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MailController {

    @Autowired
    public JavaMailSender emailSender;

    @RequestMapping(value = {"/sendEmail"}, method = RequestMethod.GET)
    public String sendEmail(Model model){
        Mail mail = new Mail();
        model.addAttribute("mail",mail);
        return "sendEmail";
    }

    @RequestMapping(value = {"/sendEmail"}, method = RequestMethod.POST)
    public String sendEmail(Model model, @ModelAttribute("mail") Mail mail) {
        String errorMessage = "Field values is required!";
        String successMessage = "Successful Submission";
        if(mail.getMessage() != null && mail.getMessage().length() > 0
           && mail.getReceiverEmail() != null && mail.getReceiverEmail().length() > 0){

            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(mail.getReceiverEmail());
            message.setSubject("Test Email");
            message.setText(mail.getMessage());
            this.emailSender.send(message);

            model.addAttribute("successMessage",successMessage);
            return "sendEmail";
        }
        model.addAttribute("errorMessage", errorMessage);
        return "sendEmail";

    }


}
