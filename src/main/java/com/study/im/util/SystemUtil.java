package com.study.im.util;

import com.study.im.common.SystemConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: im
 * @description:
 * @author: liujiawei
 * @create: 2018-12-03 17:21
 **/
public class SystemUtil {

    private static final Logger logger = LoggerFactory.getLogger(SystemUtil.class);

    public static String getServerId() {
        return System.getProperty(SystemConstant.SERVER_CODE_KEY);
    }
}
