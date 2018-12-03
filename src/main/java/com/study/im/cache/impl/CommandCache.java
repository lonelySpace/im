package com.study.im.cache.impl;

import com.study.im.annotation.CmdId;
import com.study.im.command.interfaces.ICommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: im
 * @description:
 * @author: liujiawei
 * @create: 2018-12-03 17:34
 **/
public class CommandCache extends AbstractCache<ICommand> {

    private static final Logger logger = LoggerFactory.getLogger(CommandCache.class);

    private static final Map<String, ICommand> CMD_ID_TO_COMMAND = new HashMap<>();

    @Override
    public void doLoad() throws Exception {

    }

    @Override
    public void doLoad(ICommand iCommand) throws Exception {
        CmdId cmdId = iCommand.getClass().getAnnotation(CmdId.class);
        CMD_ID_TO_COMMAND.put(cmdId.id(), iCommand);
    }

    @Override
    public ICommand get(String key) throws Exception {
        return null;
    }
}
