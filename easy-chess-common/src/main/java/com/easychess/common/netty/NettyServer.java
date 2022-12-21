package com.easychess.common.netty;

/**
 * netty 服务器 接口
 * @author Liuyunda
 * @date 2022/12/21 0:38
 */
public interface NettyServer {
    /**
     * 服务器初始化
     */

    void init();

    /**
     * 服务器销毁
     */
    void destroy();
}
