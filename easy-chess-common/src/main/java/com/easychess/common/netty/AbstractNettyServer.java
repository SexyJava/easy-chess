package com.easychess.common.netty;

import com.easychess.common.constant.CommonConstant;
import com.easychess.common.constant.LogConstant;
import com.easychess.common.constant.StringPool;
import com.easychess.common.properties.netty.NettyConfigProperties;
import com.easychess.common.util.LogUtil;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelId;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import lombok.extern.slf4j.Slf4j;

/**
 * 抽象的NettyServer
 *
 * @author liuyd
 * @date 2022/12/20 18:47
 */
@Slf4j
public abstract class AbstractNettyServer {
    /**
     * 启动类
     */
    protected ServerBootstrap serverBootstrap = new ServerBootstrap();

    /**
     * boss事件轮询线程组，处理连接事件
     */
    protected final EventLoopGroup bossGroup = new NioEventLoopGroup();

    /**
     * worker事件轮询线程组，用于数据处理
     */
    protected final EventLoopGroup workerGroup = new NioEventLoopGroup();

    /**
     * 通道
     */
    protected Channel channel;



    /**
     * netty server config
     */
    protected abstract void config();
    /**
     * netty server start
     */
    public void start(NettyConfigProperties nettyConfigProperties) {
        try {
            config();
            ChannelFuture future = serverBootstrap.bind(nettyConfigProperties.HOST, nettyConfigProperties.PORT).sync();
            if (future.isSuccess()) {
                log.info(LogUtil.customFormat(CommonConstant.BATTLE_CODE, LogConstant.SERVER_STARTED + StringPool.COMMA + LogConstant.SERVER + nettyConfigProperties.HOST + StringPool.COLON + nettyConfigProperties.PORT));
            }
            channel = future.channel();
        } catch (Exception e) {
            log.error(LogUtil.customFormat(CommonConstant.BATTLE_CODE, e.getMessage()));
        }
    }

    /**
     * netty server stop
     */
    public void stop() {
        if (channel != null) {
            channel.close();
        }
        workerGroup.shutdownGracefully();
        bossGroup.shutdownGracefully();
        log.info(LogUtil.customFormat(CommonConstant.BATTLE_CODE, LogConstant.SERVER_DESTROYED));
    }

    /**
     * channel write
     * @param channelId
     * @param msg
     * @return boolean
     */
    public boolean channelWrite(ChannelId channelId, Object msg) {
        // todo channel write
        // ChannelHandlerContext ctx = NettyServerHandler.CHANNEL_MAP.get(channelId);
        // if (ctx == null) {
        //     log.warn("通道【{}】不存在!!", channelId);
        //     return false;
        // }
        // ctx.writeAndFlush(msg);
        return true;
    }
}
