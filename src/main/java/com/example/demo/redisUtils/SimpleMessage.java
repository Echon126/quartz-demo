package com.example.demo.redisUtils;

import lombok.Data;

import java.util.Date;

/**
 * 西安中科天塔科技股份有限公司
 * Copyright (c) 2018-2028, tianta All Rights Reserved.<br/>
 * <b>@description:
 *
 * <b>@author: zwj
 *
 * <b>@create: 2019-07-03 15:18
 **/
@Data
public class SimpleMessage {
    private String content;
    private Date createTime;
    private String publisher;

}
