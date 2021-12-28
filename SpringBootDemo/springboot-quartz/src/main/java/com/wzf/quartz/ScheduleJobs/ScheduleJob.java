package com.wzf.quartz.ScheduleJobs;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

/**
 * @Author: wenzf
 * @Date 2021-12-28
 * @Description: Schedule注解方式结合Cron表达式来实现定时任务
 */

public class ScheduleJob {

    @Scheduled(cron = "0/5 * * * * *")
    public void test(String[] args) {
        System.out.println("Schedule注解方式:"+new Date());
    }


}
/***
 *     首先使用 @Scheduled 注解开启一个定时任务。
 *     @Scheduled(fixedRate = 2000)
 *     fixedRate 表示任务执行之间的时间间隔，具体是指两次任务的开始时间间隔，即第二次任务开始时，第一次任务可能还没结束。
 *     @Scheduled(fixedDelay = 2000)
 *     fixedDelay 表示任务执行之间的时间间隔，具体是指本次任务结束到下次任务开始之间的时间间隔。
 *     @Scheduled(initialDelay = 2000,fixedDelay = 2000)
 *     initialDelay 表示首次任务启动的延迟时间。
 *
 *     所有时间的单位都是毫秒。
 */
