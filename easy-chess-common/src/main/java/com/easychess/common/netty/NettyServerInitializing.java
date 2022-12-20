package com.easychess.common.netty;

import javax.annotation.PostConstruct;

/**
 * Netty 服务器初始化

 *
 * @author liuyd
 * @date 2022/12/20 18:39
 */
public interface NettyServerInitializing {
    /**
     * 服务器初始化
     */
    @PostConstruct
    void init();
}
