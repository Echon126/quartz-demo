package com.example.demo;

import com.example.demo.quartezs.AppQuartz;
import com.example.demo.quartezs.JobUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private JobUtil jobUtil;
	@Test
	public void contextLoads() throws Exception {
		AppQuartz appQuartz = new AppQuartz();
		appQuartz.setJobName("执行job1");
		appQuartz.setJobGroup("JobOne");
		appQuartz.setStartTime("2019-04-20 23:44:00");
        appQuartz.setCronExpression("0 0/1 * * * ?");
		appQuartz.setInvokeParam("sdsdsds");
		appQuartz.setQuartzId(1);
		jobUtil.addJob(appQuartz);
	}

}
