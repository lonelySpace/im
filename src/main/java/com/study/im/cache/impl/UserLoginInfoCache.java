package com.study.im.cache.impl;

import com.study.im.redis.RedisUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: im
 * @description:
 * @author: liujiawei
 * @create: 2018-12-03 16:51
 **/
public class UserLoginInfoCache extends AbstractCache<UserLoginInfoCache> {

    private static final Logger logger = LoggerFactory.getLogger(UserLoginInfoCache.class);

    @Override
    public void doLoad() throws Exception{}

    @Override
    public void doLoad(UserLoginInfoCache userLoginInfoCache) throws Exception {}

    @Override
    public UserLoginInfoCache get(String key) throws Exception {
        if (StringUtils.isNotEmpty(key)) {
            return (UserLoginInfoCache) RedisUtil.get(key);
        } else {
            logger.error("key is null");
            throw new Exception("cache key is null");
        }
    }
}
