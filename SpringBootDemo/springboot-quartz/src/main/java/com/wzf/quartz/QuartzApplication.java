package com.wzf.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class QuartzApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuartzApplication.class, args);
	}

    //方式1：@Scheduled 注解方式实现和cron 表达式
	//[秒] [分] [小时] [日] [月] [周] [年]
	@Scheduled(cron = "0/5 * * * * *")
	public void test() {
		System.out.println("@Scheduled 注解方式："+new Date());
	}
}
