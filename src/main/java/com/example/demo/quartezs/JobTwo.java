package com.example.demo.quartezs;


import org.quartz.*;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/4/20.
 */
@PersistJobDataAfterExecution
@DisallowConcurrentExecution
@Component
public class JobTwo implements Job {
    public void execute(JobExecutionContext context) throws JobExecutionException{
        JobDataMap data=context.getTrigger().getJobDataMap();
        String invokeParam =(String) data.get("invokeParam");
        //在这里实现业务逻辑
        System.out.println("执行job2-----------------------------");
    }
}
