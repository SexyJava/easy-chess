package com.easychess.common.netty;

import javax.annotation.PreDestroy;

/**
 * Netty 服务器销毁
 *
 * @author liuyd
 * @date 2022/12/20 18:41
 */
public interface NettyServerDestruction {
    /**
     * 服务器销毁
     */
    @PreDestroy
    void destroy();
}
