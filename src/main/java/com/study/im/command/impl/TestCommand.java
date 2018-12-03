package com.study.im.command.impl;

import com.study.im.annotation.CmdId;
import com.study.im.command.interfaces.ICommand;
import com.study.im.common.Request;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.Target;

/**
 * @program: im
 * @description:
 * @author: liujiawei
 * @create: 2018-12-03 17:42
 **/
@CmdId(id = "00000")
public class TestCommand implements ICommand {

    private static final Logger logger = LoggerFactory.getLogger(TestCommand.class);

    @Override
    public void execute(Request request, Channel channel) throws Exception {

    }
}
