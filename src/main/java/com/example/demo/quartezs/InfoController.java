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
        appQuartz.setStartTime("2019-04-21 00:42:50");
        appQuartz.setCronExpression("51 42 00 21 04 ? 2019");
        appQuartz.setInvokeParam("sdsdsds");
        appQuartz.setQuartzId(1);
        String ss = jobUtil.addJob(appQuartz);
        System.out.println("-------------------");
        return ss;
    }

    @RequestMapping("/execute1")
    public String exse() throws Exception {
        AppQuartz appQuartz = new AppQuartz();
        appQuartz.setJobName("执行job1121");
        appQuartz.setJobGroup("JobOne");
        appQuartz.setStartTime("2019-04-21 00:43:50");
        appQuartz.setCronExpression("51 43 00 21 04 ? 2019");
        appQuartz.setInvokeParam("sdsdsds");
        appQuartz.setQuartzId(2);
        String ss = jobUtil.addJob(appQuartz);
        System.out.println("-------------------");
        return ss;
    }

}
