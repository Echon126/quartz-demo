package com.example.demo.redisUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 西安中科天塔科技股份有限公司
 * Copyright (c) 2018-2028, tianta All Rights Reserved.<br/>
 * <b>@description:
 *
 * <b>@author: zwj
 *
 * <b>@create: 2019-07-03 15:13
 **/
@Service
@EnableScheduling
public class RedisPubSub {
    private static final Logger logger = LoggerFactory.getLogger(RedisPubSub.class);

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    private ChannelTopic topic = new ChannelTopic("/redis/pubsub");

    @Scheduled(initialDelay = 5000, fixedDelay = 10000)
    private void schedule() {
        logger.info("publish message");
        publish("admin", "must go now");
    }

    private void publish(String publisher, String content) {
        logger.info("message send {} by {}", content, publisher);
        SimpleMessage simpleMessage = new SimpleMessage();
        simpleMessage.setContent(content);
        simpleMessage.setCreateTime(new Date());
        simpleMessage.setPublisher(publisher);
        this.redisTemplate.convertAndSend(topic.getTopic(), simpleMessage);
    }
}






















