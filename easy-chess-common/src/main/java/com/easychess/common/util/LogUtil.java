package com.easychess.common.util;

import com.easychess.common.constant.StringPool;

/**
 * 日志工具类
 *
 * @author liuyd
 * @date 2022/12/20 18:14
 */
public class LogUtil {

    /**
     * 自定义日志格式
     * @param code
     * @param msg
     * @return String [---code: msg---]
     */
    public static String customFormat(String code, String msg) {
        StringBuilder info = new StringBuilder();
        return info.append(StringPool.LEFT_SQ_BRACKET).append(StringPool.DASH).append(StringPool.DASH).append(StringPool.DASH).append(code).append(StringPool.COLON).append(StringPool.SPACE).append(msg).append(StringPool.DASH).append(StringPool.DASH).append(StringPool.DASH).append(StringPool.RIGHT_SQ_BRACKET).toString();
    }
}
