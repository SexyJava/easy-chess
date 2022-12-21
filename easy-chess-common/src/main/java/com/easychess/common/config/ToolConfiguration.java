package com.easychess.common.config;

import com.easychess.common.util.SpringUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * 工具类配置
 *
 * @author liuyd
 * @date 2022/12/21 11:12
 */
@Order
@Configuration
public class ToolConfiguration {

    @Bean
    public SpringUtil springUtil() { return new SpringUtil();}
}
