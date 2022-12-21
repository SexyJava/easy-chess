package com.easychess.battle.server;

import com.easychess.common.netty.AbstractNettyServer;
import io.netty.channel.ChannelOption;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Battle Netty Server
 *
 * @author Liuyunda
 * @date 2022/12/21 0:36
 */
@Component
public class BattleNettyServer extends AbstractNettyServer {

    /**
     * handler 初始化器
     */
    @Autowired
    public BattleNettyServerInitializer battleNettyServerInitializer;

    @Override
    public void config() {
        // 设置参数，组配置
        serverBootstrap.group(bossGroup, workerGroup)
                // 指定channel
                .channel(NioServerSocketChannel.class)
                // 初始化服务端可连接队列
                .option(ChannelOption.SO_BACKLOG, 1024)
                // 允许重复使用本地地址和端口，连接关闭后，可以立即重用端口
                .option(ChannelOption.SO_REUSEADDR, true)
                // 设置TCP长连接，TCP会主动探测空闲连接的有效性
                .childOption(ChannelOption.SO_KEEPALIVE, true)
                // 禁用Nagle算法，小数据时可以即时传输
                .childOption(ChannelOption.TCP_NODELAY, true)
                // 发送缓冲区大小
                .childOption(ChannelOption.SO_SNDBUF, 256 * 1024)
                // 接收缓冲区大小
                .childOption(ChannelOption.SO_RCVBUF, 256 * 1024)
                // Netty服务端channel初始化
                .childHandler(battleNettyServerInitializer);
    }
}
