package com.study.im.cache;

import com.study.im.cache.interfaces.ICache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @program: im
 * @description: 缓存工厂，用来初始化缓存信息
 * @author: liujiawei
 * @create: 2018-12-03 16:35
 **/
public class CacheFactory {

    private static final Logger logger = LoggerFactory.getLogger(CacheFactory.class);

    private List<ICache> caches;

    public void init() {
        if (caches != null) {
            for (ICache cache : caches) {
                cache.load();
            }
            logger.info("所有缓存加载完毕...");
        } else {
            logger.info("未配置缓存加载类...");
        }
    }
}
