package com.study.im.common;


/**
 * @program: im
 * @description: 请求头
 * @author: liujiawei
 * @create: 2018-12-03 17:10
 **/
public class RequestHeader {

    private long userId;

    private Long destUserId;

    public Long getDestUserId() {
        return destUserId;
    }

    public void setDestUserId(Long destUserId) {
        this.destUserId = destUserId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
