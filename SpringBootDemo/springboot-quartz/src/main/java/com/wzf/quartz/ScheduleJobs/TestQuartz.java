package com.wzf.quartz.ScheduleJobs;

import java.util.Date;

/**
 * @Author: wenzf
 * @Date 2021-12-28
 * @Description:
 */
public class TestQuartz {
    public String quartz() {
        return "job2-->:" + new Date();
    }
}
