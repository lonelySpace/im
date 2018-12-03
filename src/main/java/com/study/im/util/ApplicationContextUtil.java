package com.study.im.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @program: im
 * @description:
 * @author: liujiawei
 * @create: 2018-12-03 18:02
 **/
public class ApplicationContextUtil implements ApplicationContextAware {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationContextUtil.class);

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
