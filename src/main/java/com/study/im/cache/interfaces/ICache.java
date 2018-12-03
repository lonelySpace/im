package com.study.im.cache.interfaces;


/**
 * @program: im
 * @description: 缓存通用接口，用来抽象通用的缓存方法
 * @author: liujiawei
 * @create: 2018-12-03 16:34
 **/
public interface ICache<T> {

    /**
     * 加载所有信息
     */
    void load() throws Exception;

    /**
     * 加载指定信息
     * @param t
     */
    void load(T t) throws Exception;

    /**
     * 从缓存中获取信息
     * @param key
     * @return
     */
    T get(String key) throws Exception;
}
