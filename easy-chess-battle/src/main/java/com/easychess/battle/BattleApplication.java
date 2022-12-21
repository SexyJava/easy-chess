package com.easychess.battle;

import com.easychess.common.netty.NettyServerInitializing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 对战服
 *
 * @author liuyd
 * @date 2022/12/20 16:08
 */
@SpringBootApplication(scanBasePackages = "com.easychess")
public class BattleApplication extends NettyServerInitializing {

    public static void main(String[] args) {
        SpringApplication.run(BattleApplication.class,args);
    }
}
