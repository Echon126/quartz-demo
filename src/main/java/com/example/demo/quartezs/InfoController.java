package com.example.demo.quartezs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/4/20.
 */
@RestController
public class InfoController {
    @Autowired
    private JobUtil jobUtil;

    @RequestMapping("/execute")
    public String exe() throws Exception {
        AppQuartz appQuartz = new AppQuartz();
        appQuartz.setJobName("执行job1");
        appQuartz.setJobGroup("JobOne");
        appQuartz.setStartTime("2019-04-20 23:49:00");
        appQuartz.setCronExpression("0 0/1 * * * ?");
        appQuartz.setInvokeParam("sdsdsds");
        appQuartz.setQuartzId(1);
        String ss = jobUtil.addJob(appQuartz);
        return ss;
    }

}
