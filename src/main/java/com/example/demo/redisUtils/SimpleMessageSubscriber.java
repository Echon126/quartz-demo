package com.example.demo.redisUtils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 西安中科天塔科技股份有限公司
 * Copyright (c) 2018-2028, tianta All Rights Reserved.<br/>
 * <b>@description:
 *
 * <b>@author: zwj
 *
 * <b>@create: 2019-07-03 15:23
 **/
@Component
public class SimpleMessageSubscriber {
    private static final Logger logger = LoggerFactory.getLogger(SimpleMessageSubscriber.class);

    public void onMessage(SimpleMessage message, String pattern) {
        logger.info("topic {} received {} ", pattern, message.getContent());
    }
}
