package com.example.demo.quartezs;

import org.quartz.Scheduler;
import org.quartz.ee.servlet.QuartzInitializerListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;


@Configuration
public class JobConfiguration {
    private JobFactory jobFactory;
    public JobConfiguration(JobFactory jobFactory){
        this.jobFactory = jobFactory;
    }

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean() {
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        schedulerFactoryBean.setOverwriteExistingJobs(true);
        schedulerFactoryBean.setJobFactory(jobFactory);
        return schedulerFactoryBean;
    }

    @Bean
    public Scheduler scheduler() {
        return schedulerFactoryBean().getScheduler();
    }

    @Bean
    public QuartzInitializerListener executorListener() {
        return new QuartzInitializerListener();
    }
}
