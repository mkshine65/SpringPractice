package com.example.springmailer.controller;


import com.example.springmailer.model.MailFormat;
import com.example.springmailer.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MailController {

    @Autowired
    private EmailSenderService service;

    @PostMapping("/sendmail")
    public ResponseEntity<String> sendMail(@RequestBody List<MailFormat> list)
    {
        for(int i=0;i<list.size();i++) {
            MailFormat mailFormat=list.get(i);
            System.out.println(mailFormat.toString());
            service.sendSimpleEmail(mailFormat.getMail(), mailFormat.getBody(), mailFormat.getSubject());
        }

        return new ResponseEntity<>("Successfully sent Mail", HttpStatus.OK);
    }
}
