package com.example.springmailer.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerService {

    /**
     * Scheduler service to send mail with fixed delay
     */
    /*@Scheduled(fixedDelay = 5000)
    public void print()
    {
        System.out.println("This is scheduler");
    }*/
}
