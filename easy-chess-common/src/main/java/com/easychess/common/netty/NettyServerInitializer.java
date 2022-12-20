package com.easychess.common.netty;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;

/**
 * NettyServer 初始化handler
 * @author Liuyunda
 * @date 2022/12/21 1:08
 */
public class NettyServerInitializer extends ChannelInitializer<Channel> {

    @Override
    protected void initChannel(Channel ch) throws Exception {
        // todo init option
    }
}
