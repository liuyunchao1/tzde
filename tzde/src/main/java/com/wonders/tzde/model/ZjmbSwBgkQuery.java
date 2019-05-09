package com.wonders.tzde.model;

/**
 * 死亡数据共享接口-查询参数实体
 */
public class ZjmbSwBgkQuery {
    /**
     * 审核标志
     */
    private String vcShbz;

    /**
     * 身份证号码
     */
    private String zjhm;

    public String getVcShbz() {
        return vcShbz;
    }

    public void setVcShbz(String vcShbz) {
        this.vcShbz = vcShbz;
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }
}
