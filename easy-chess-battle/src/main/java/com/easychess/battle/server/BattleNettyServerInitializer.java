package com.easychess.battle.server;

import com.easychess.battle.handler.BattleServerHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * NettyServer 初始化handler
 * @author Liuyunda
 * @date 2022/12/21 1:08
 */
@Component
public class BattleNettyServerInitializer extends ChannelInitializer<SocketChannel> {
    @Autowired
    private BattleServerHandler channelHandler;
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        // todo 编解码
        pipeline.addLast(channelHandler);
    }
}
