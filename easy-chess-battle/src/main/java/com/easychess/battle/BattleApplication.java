package com.easychess.battle;

import com.easychess.common.netty.CommonNettyServer;
import com.easychess.common.netty.NettyServer;
import com.easychess.common.properties.netty.NettyConfigProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

import javax.annotation.Resource;

/**
 * 对战服
 *
 * @author liuyd
 * @date 2022/12/20 16:08
 */
@Slf4j
@SpringBootApplication
@ConditionalOnBean(NettyConfigProperties.class)
public class BattleApplication implements NettyServer {

    @Resource
    CommonNettyServer commonNettyServer;
    public static void main(String[] args) {
        SpringApplication.run(BattleApplication.class,args);
    }

    @Override
    public void init() {
        commonNettyServer.start();
    }
    @Override
    public void destroy() {
        commonNettyServer.stop();
    }

}
