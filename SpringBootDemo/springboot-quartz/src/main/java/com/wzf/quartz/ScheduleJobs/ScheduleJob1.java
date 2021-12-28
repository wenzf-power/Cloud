package com.wzf.quartz.ScheduleJobs;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: wenzf
 * @Date 2021-12-28
 * @Description:
 */
@Component
public class ScheduleJob1 {

    public void job1() {
        System.out.println("job1->>"+new Date());
    }

}
