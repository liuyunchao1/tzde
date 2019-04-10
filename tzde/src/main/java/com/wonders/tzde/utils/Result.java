package com.wonders.tzde.utils;

/**
 * Controller返回的结果封装
 */
public class Result {
    /**
     * 状态码，0为成功，其余为失败
     */
    private int code;

    /**
     * 当状态为错误时的错误消息
     */
    private String message;

    /**
     * 具体的数据
     */
    private Object data;

    public Result(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 成功时的返回
     * @param data 具体的数据
     * @return
     */
    public static Result success(Object data) {
        return new Result(0, null, data);
    }

    /**
     * 失败时的返回
     * @param code 状态码
     * @param message 错误消息
     * @param data 具体的数据
     * @return
     */
    public static Result fail(int code, String message, Object data) {
        return new Result(code, message, data);
    }
}
