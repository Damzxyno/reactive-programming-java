package com.damzxyno.javareactiveprogramming.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class GreetingScheduler {
    @Scheduled(fixedDelay = 1L)
    public void printGreeting(){
        System.out.println("Hello Damilola, it is " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH-mm")));
    }
}
