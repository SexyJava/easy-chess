package com.easychess.battle;

import com.easychess.common.constant.CommonConstant;
import com.easychess.common.constant.LogConstant;
import com.easychess.common.netty.AbstractNettyServer;
import com.easychess.common.util.LogUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 对战服
 *
 * @author liuyd
 * @date 2022/12/20 16:08
 */
@Slf4j
@SpringBootApplication
public class BattleApplication extends AbstractNettyServer {
    public static void main(String[] args) {
        SpringApplication.run(BattleApplication.class,args);
    }

    @Override
    public void init() {
        log.info(LogUtil.customFormat(CommonConstant.BATTLE_CODE, LogConstant.SERVER_STARTED));
    }
    @Override
    public void destroy() {
        log.info(LogUtil.customFormat(CommonConstant.BATTLE_CODE, LogConstant.SERVER_DESTROYED));
    }
}
