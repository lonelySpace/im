package com.study.im.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: im
 * @description: 用来记录用户的登陆信息
 * @author: liujiawei
 * @create: 2018-12-03 16:51
 **/
public class UserLoginInfo {

    private String serverId;

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }
}
