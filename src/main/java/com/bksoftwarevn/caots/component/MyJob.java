package com.bksoftwarevn.caots.component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyJob {

    @Scheduled(fixedDelay = 1000)
    //fixedDelay : khi nào task trước đó thực hiện xong thì nó mới chạy tiếp task đó lại lần nữa
    public void scheduleFixedDelayTask(){
        System.out.println("task1: "+ new Date());
    }

    @Scheduled(fixedRate = 2000)
    //fixedRate : Không cần quan tâm task trước đó thực hiện xong  hay chưa ,nó vẫn chạy tiếp task đó lại lần nữa
    public void scheduleFixedRateTask(){
        System.out.println("task2: "+new Date());
    }

    @Scheduled(cron = "10-15*/3 * * * * *")
    //@Scheduled(cron = "5-10/1 * 12-14 * * MON-FRI") từ giây thứ 5 đến giây thứ 10 trong khoảng thời gian 12h-14h
    // các ngày từ thứ 2 đến thứ 6, cứ 1 giây lặp lại một lần

    //Bằng cron ta có thể định nghĩa thời gian chạy theo giờ, phút, giây, ngày tháng năm, trong khoảng thời gian nào…
    // do đó việc đặt lịch linh hoạt hơn so với fixedDelay và fixedRate rất nhiều
    public void scheduleTaskUsingCronExpression(){
        System.out.println("task3: "+new Date());
    }

}
