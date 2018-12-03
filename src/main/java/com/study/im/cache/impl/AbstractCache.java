package com.study.im.cache.impl;

import com.study.im.cache.interfaces.ICache;
import com.study.im.util.TimeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: im
 * @description:
 * @author: liujiawei
 * @create: 2018-12-03 16:39
 **/
public abstract class AbstractCache<T> implements ICache<T> {

    private static final Logger logger = LoggerFactory.getLogger(AbstractCache.class);

    @Override
    public void load() throws Exception{
        long start = TimeUtil.getCurrentTime();
        logger.info(this.getClass() + "开始加载缓存...");
        doLoad();
        long end = TimeUtil.getCurrentTime();
        logger.info(this.getClass() + "加载完成，共耗时{}ms...", end - start);
    }

    /**
     * 加载缓存
     */
    public abstract void doLoad() throws Exception;

    @Override
    public void load(T t) throws Exception{
        doLoad(t);
        logger.info(this.getClass() + "刷新完毕...");
    }

    public abstract void doLoad(T t) throws Exception;
}
