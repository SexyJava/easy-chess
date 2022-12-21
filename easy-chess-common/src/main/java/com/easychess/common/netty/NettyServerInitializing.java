package com.easychess.common.netty;

import com.easychess.common.properties.netty.NettyConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Netty 服务器初始化

 *
 * @author liuyd
 * @date 2022/12/20 18:39
 */
public class NettyServerInitializing implements NettyServer{
    @Resource
    private AbstractNettyServer nettyServer;
    @Autowired
    private NettyConfigProperties nettyConfigProperties;
    @PostConstruct
    @Override
    public void init() {
        nettyServer.start(nettyConfigProperties);
    }

    @PreDestroy
    @Override
    public void destroy() {
        nettyServer.stop();
    }
}
