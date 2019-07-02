package com.example.demo.els;

import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 西安中科天塔科技股份有限公司
 * Copyright (c) 2018-2028, tianta All Rights Reserved.<br/>
 * <b>@description:
 *
 * <b>@author: zwj
 *
 * <b>@create: 2019-07-02 15:21
 **/

@Configuration
@ConfigurationProperties(prefix = "elasticjob")
public class ElasticJobConfig {
    private String serverList;
    private String nameSpace;

    public String getServerList() {
        return serverList;
    }

    public void setServerList(String serverList) {
        this.serverList = serverList;
    }

    public String getNameSpace() {
        return nameSpace;
    }

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    @Bean(initMethod = "init")
    public ZookeeperRegistryCenter regCenter() {
        System.out.println(this.getServerList()+"============"+this.getNameSpace());
        return new ZookeeperRegistryCenter(new ZookeeperConfiguration(this.getServerList(), this.getNameSpace()));
    }

}
