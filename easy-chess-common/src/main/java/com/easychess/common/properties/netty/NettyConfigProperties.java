package com.easychess.common.properties.netty;

import com.easychess.common.constant.CommonConstant;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.stereotype.Component;

/**
 * Netty 配置类
 * @author Liuyunda
 * @date 2022/12/21 0:09
 */
@Data
@Component
@ConfigurationProperties(prefix = CommonConstant.NETTY_CONFIG_PREFIX)
public class NettyConfigProperties {

    /**
     * netty ip
     */
    public String HOST = null;

    /**
     * netty port
     */
    public  Integer PORT = null;
}
