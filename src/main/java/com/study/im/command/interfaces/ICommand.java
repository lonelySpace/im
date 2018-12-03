package com.study.im.command.interfaces;

import com.study.im.common.Request;
import io.netty.channel.Channel;

/**
 * @program: im
 * @description:
 * @author: liujiawei
 * @create: 2018-12-03 17:36
 **/
public interface ICommand {

    void execute(Request request, Channel channel) throws Exception;
}
