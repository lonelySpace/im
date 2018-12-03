package com.study.im.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: im
 * @description:
 * @author: liujiawei
 * @create: 2018-12-03 16:42
 **/
public class TimeUtil {

    private static final Logger logger = LoggerFactory.getLogger(TimeUtil.class);

    public static long getCurrentTime() {
        return System.currentTimeMillis();
    }
}
