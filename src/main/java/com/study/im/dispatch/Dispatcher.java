package com.study.im.dispatch;

import com.study.im.cache.interfaces.ICache;
import com.study.im.common.Request;
import com.study.im.entity.UserLoginInfo;
import com.study.im.util.SystemUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: im
 * @description: 转发器，用来转发消息处理用户不在同一台服务器上的消息,
 * 如果用户在同一台服务器上直接找到对应的command，进行消息处理
 * @author: liujiawei
 * @create: 2018-12-03 16:29
 **/
public class Dispatcher {

    private static final Logger logger = LoggerFactory.getLogger(Dispatcher.class);

    private ICache<UserLoginInfo> userLoginInfoICache;

    public void dispatch(Request request) {
        Long destUserId = request.getHeader().getDestUserId();
        if (request.getHeader().getDestUserId() != null) {
            try {
                UserLoginInfo userLoginInfo = userLoginInfoICache.get(String.valueOf(destUserId));
                boolean needDispatch = isNeedDispatch(userLoginInfo);
                // TODO: 2018/12/3 生成新的转发request
            } catch (Exception e) {
                logger.error("获取登陆信息失败", e);
            }
        }
        // TODO: 2018/12/3 获取对应的command

    }

    private boolean isNeedDispatch(UserLoginInfo userLoginInfo) {
        return SystemUtil.getServerId().equals(userLoginInfo.getServerId());
    }
}
