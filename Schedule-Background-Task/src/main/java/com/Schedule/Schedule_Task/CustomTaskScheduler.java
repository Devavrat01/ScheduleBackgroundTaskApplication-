package com.Schedule.Schedule_Task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class CustomTaskScheduler {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    // Run every 5 seconds
    @Scheduled(fixedRate = 5000)
    public void runAtFixedRate() {
        System.out.println("Fixed Rate Task :: " + formatter.format(LocalDateTime.now()));
    }

    // Run 5 seconds after last completion
    // @Scheduled(fixedDelay = 5000)
    public void runWithFixedDelay() {
        System.out.println("Fixed Delay Task :: " + formatter.format(LocalDateTime.now()));
    }

    // Run every day at 10:00 AM
    // @Scheduled(cron = "0 0 10 * * ?")
    public void runWithCron() {
        System.out.println("Cron Task :: " + formatter.format(LocalDateTime.now()));
    }
}
