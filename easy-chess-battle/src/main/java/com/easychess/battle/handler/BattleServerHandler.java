package com.easychess.battle.handler;

import com.easychess.common.constant.CommonConstant;
import com.easychess.common.constant.EventType;
import com.easychess.common.util.LogUtil;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Battle handler
 *
 * @author liuyd
 * @date 2022/12/21 16:00
 */
@Slf4j
@Component
public class BattleServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        log.info(LogUtil.event(CommonConstant.BATTLE_CODE, channel.remoteAddress().toString(), EventType.CONNECTED));
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        log.info(LogUtil.event(CommonConstant.BATTLE_CODE, channel.remoteAddress().toString(), EventType.DISCONNECTED));
    }

    /**
     * 读取数据（读取客户端发送的消息）
     *
     * @param ctx 上下文对象，含有管道Pipeline，通道Channel，地址
     * @param msg 客户端发送的数据
     * @throws Exception
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        Channel channel = ctx.channel();
        // 读取从客户端发送的msg
        log.info(LogUtil.event(CommonConstant.BATTLE_CODE, channel.remoteAddress().toString(), EventType.READ, msg.toString()));
    }


    /**
     * 处理异常关闭通道
     *
     * @param ctx
     * @param cause
     * @throws Exception
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        Channel channel = ctx.channel();
        log.error(LogUtil.error(CommonConstant.BATTLE_CODE, channel.remoteAddress().toString(), cause.getMessage()));
        cause.printStackTrace();
        ctx.close();
    }
}
