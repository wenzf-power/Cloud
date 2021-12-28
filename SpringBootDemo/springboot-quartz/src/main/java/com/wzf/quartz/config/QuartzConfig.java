package com.wzf.quartz.config;

import com.wzf.quartz.ScheduleJobs.ScheduleJob2;
import com.wzf.quartz.ScheduleJobs.TestQuartz;
import org.quartz.JobDataMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.*;

import java.util.Date;

/**
 * @Author: wenzf
 * @Date 2021-12-28
 * @Description:
 */
@Configuration
public class QuartzConfig {

    @Bean
    MethodInvokingJobDetailFactoryBean methodInvokingJobDetailFactoryBean() {
        MethodInvokingJobDetailFactoryBean bean = new MethodInvokingJobDetailFactoryBean();
        bean.setTargetBeanName("scheduleJob1");
        bean.setTargetMethod("job1");
        return bean;
    }

    @Bean
    JobDetailFactoryBean jobDetailFactoryBean() {
        JobDetailFactoryBean bean = new JobDetailFactoryBean();
        bean.setJobClass(ScheduleJob2.class);
        JobDataMap map = new JobDataMap();
        map.put("TestQuartz", testQuartz());
        bean.setJobDataMap(map);
        return bean;
    }

    @Bean
    SimpleTriggerFactoryBean simpleTriggerFactoryBean() {
        SimpleTriggerFactoryBean bean = new SimpleTriggerFactoryBean();
        bean.setStartTime(new Date());
        //bean.setRepeatCount(5); //重复定时次数
        bean.setJobDetail(methodInvokingJobDetailFactoryBean().getObject());
        bean.setRepeatInterval(3000);//间隔
        return bean;
    }

    @Bean
    CronTriggerFactoryBean cronTrigger() {
        CronTriggerFactoryBean bean = new CronTriggerFactoryBean();
        bean.setCronExpression("0/10 * * * * ?");//每10秒
        bean.setJobDetail(jobDetailFactoryBean().getObject());
        return bean;
    }

    @Bean
    SchedulerFactoryBean schedulerFactoryBean() {
        SchedulerFactoryBean bean = new SchedulerFactoryBean();
        bean.setTriggers(cronTrigger().getObject(), simpleTriggerFactoryBean().getObject());
        return bean;
    }

    @Bean
    TestQuartz testQuartz(){
        return new TestQuartz();
    }
}
/***
 * 配置文件说明：
 *
 * JobDetail 的配置有两种方式：MethodInvokingJobDetailFactoryBean 和 JobDetailFactoryBean 。
 *
 * 使用 MethodInvokingJobDetailFactoryBean 可以配置目标 Bean 的名字和目标方法的名字，这种方式不支持传参。
 *
 * 使用 JobDetailFactoryBean 可以配置 JobDetail ，任务类继承自 QuartzJobBean ，这种方式支持传参，将参数封装在 JobDataMap 中进行传递。
 *
 * Trigger 是指触发器，Quartz 中定义了多个触发器，这里向大家展示其中两种的用法，SimpleTrigger 和 CronTrigger 。
 *
 * SimpleTrigger 有点类似于前面说的 @Scheduled 的基本用法。
 *
 * CronTrigger 则有点类似于 @Scheduled 中 cron 表达式的用法
 */
