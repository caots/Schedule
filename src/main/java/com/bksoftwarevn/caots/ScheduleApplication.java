package com.bksoftwarevn.caots;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@SpringBootApplication
@EnableScheduling
public class ScheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduleApplication.class, args);
    }

    @Bean
    public TaskScheduler taskScheduler() {

        final ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(10); // 10 Luồng, mỗi task chạy một luồng đọc lập
        return scheduler;
    }

}


