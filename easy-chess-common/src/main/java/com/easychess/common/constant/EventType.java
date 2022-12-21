package com.easychess.common.constant;

/**
 * 事件类型
 *
 * @author liuyd
 * @date 2022/12/21 16:21
 */
public enum EventType {
    /**
     * 已连接
     */
    CONNECTED(1, "Connected"),
    /**
     * 已断开
     */
    DISCONNECTED(2, "Disconnected"),
    /**
     * 读取
     */
    READ(3, "Read");
    /**
     * 标识
     */
    private int code;
    /**
     * 信息
     */
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    EventType(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return getCode() + StringPool.UNDERSCORE + getMsg();
    }
}
