package com.wonders.tzde.utils;

/**
 * Controller返回的结果封装
 * 字段根据客户提供的接口文档中的要示来
 */
public class Result {
    /**
     * 状态码，
     * 00代表成功，即有结果返回，其余代表“失败”
     */
    private String result;

    /**
     * 描述信息,
     * 若result为“00”则直接写成”成功”,否则写成失败的原因表述,如“入参不能为空”
     */
    private String resultmsg;

    /**
     * 返回结果数量
     */
    private Integer dataCount;

    private Object data;

    /**
     * 具体的数据
     */
    private Object datas;

    private String requestId;

    private String interfaces;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResultmsg() {
        return resultmsg;
    }

    public void setResultmsg(String resultmsg) {
        this.resultmsg = resultmsg;
    }

    public Integer getDataCount() {
        return dataCount;
    }

    public void setDataCount(Integer dataCount) {
        this.dataCount = dataCount;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getDatas() {
        return datas;
    }

    public void setDatas(Object datas) {
        this.datas = datas;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(String interfaces) {
        this.interfaces = interfaces;
    }

    public Result(String result, String resultmsg, Integer dataCount, Object datas) {
        this.result = result;
        this.resultmsg = resultmsg;
        this.dataCount = dataCount;
        this.datas = datas;
    }

    /**
     * 成功时的返回
     * @param dataCount 结果数量
     * @param datas 具体的数据
     * @return
     */
    public static Result success(Integer dataCount, Object datas) {
        return new Result("00", "成功", dataCount, datas);
    }

    /**
     * 失败时的返回
     * @param result 状态码
     * @param resultmsg 错误消息
     * @return
     */
    public static Result fail(String result, String resultmsg) {
        return new Result(result, resultmsg, 0, null);
    }
}
