package com.easychess.common.util;

import com.easychess.common.constant.EventType;
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
     * @return String
     */
    public static String customFormat(String code, String msg) {
        StringBuilder info = new StringBuilder();
        // ★★★===code: msg===★★★
        return info.append(StringPool.SOLID_START).append(StringPool.SOLID_START).append(StringPool.SOLID_START).append(StringPool.EQUALS).append(StringPool.EQUALS).append(StringPool.EQUALS).append(code).append(StringPool.COLON).append(StringPool.SPACE).append(msg).append(StringPool.EQUALS).append(StringPool.EQUALS).append(StringPool.EQUALS).append(StringPool.SOLID_START).append(StringPool.SOLID_START).append(StringPool.SOLID_START).toString();
    }

    /**
     * 事件类型日志
     * @param code
     * @param who
     * @param eventType
     * @return String
     */
    public static String event(String code,String who, EventType eventType) {
        StringBuilder info = new StringBuilder();
        // ★★★===code[eventType]: who===★★★
        return info.append(StringPool.SOLID_START).append(StringPool.SOLID_START).append(StringPool.SOLID_START).append(StringPool.EQUALS).append(StringPool.EQUALS).append(StringPool.EQUALS).append(code).append(StringPool.LEFT_SQ_BRACKET).append(eventType.toString()).append(StringPool.RIGHT_SQ_BRACKET).append(StringPool.COLON).append(StringPool.SPACE).append(who).append(StringPool.EQUALS).append(StringPool.EQUALS).append(StringPool.EQUALS).append(StringPool.SOLID_START).append(StringPool.SOLID_START).append(StringPool.SOLID_START).toString();
    }
    /**
     * 事件类型日志
     * @param code
     * @param who
     * @param eventType
     * @return String
     */
    public static String event(String code,String who, EventType eventType, String msg) {
        StringBuilder info = new StringBuilder();
        // ★★★===code[eventType]: who {}===★★★
        return info.append(StringPool.SOLID_START).append(StringPool.SOLID_START).append(StringPool.SOLID_START).append(StringPool.EQUALS).append(StringPool.EQUALS).append(StringPool.EQUALS).append(code).append(StringPool.LEFT_SQ_BRACKET).append(eventType.toString()).append(StringPool.RIGHT_SQ_BRACKET).append(StringPool.COLON).append(StringPool.SPACE).append(who).append(StringPool.SPACE).append(StringPool.LEFT_BRACE).append(msg).append(StringPool.RIGHT_BRACE).append(StringPool.EQUALS).append(StringPool.EQUALS).append(StringPool.EQUALS).append(StringPool.SOLID_START).append(StringPool.SOLID_START).append(StringPool.SOLID_START).toString();
    }

    /**
     * 异常日志
     * @param code
     * @param who
     * @param msg
     * @return String
     */
    public static String error(String code,String who, String msg) {
        StringBuilder info = new StringBuilder();
        // ★★★===code{who}: msg ===★★★
        return info.append(StringPool.SOLID_START).append(StringPool.SOLID_START).append(StringPool.SOLID_START).append(StringPool.EQUALS).append(StringPool.EQUALS).append(StringPool.EQUALS).append(code).append(StringPool.LEFT_BRACE).append(who).append(StringPool.RIGHT_BRACE).append(StringPool.COLON).append(StringPool.SPACE).append(msg).append(StringPool.SPACE).append(msg).append(StringPool.EQUALS).append(StringPool.EQUALS).append(StringPool.EQUALS).append(StringPool.SOLID_START).append(StringPool.SOLID_START).append(StringPool.SOLID_START).toString();
    }
}
