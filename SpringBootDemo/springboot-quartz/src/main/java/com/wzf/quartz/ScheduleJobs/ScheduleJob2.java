package com.wzf.quartz.ScheduleJobs;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @Author: wenzf
 * @Date 2021-12-28
 * @Description:
 */
public class ScheduleJob2 extends QuartzJobBean {

    TestQuartz testQuartz;

    public TestQuartz getTestQuartz() {
        return testQuartz;
    }

    public void setTestQuartz(TestQuartz testQuartz) {
        this.testQuartz = testQuartz;
    }

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        System.out.println(testQuartz.quartz());
    }
}
