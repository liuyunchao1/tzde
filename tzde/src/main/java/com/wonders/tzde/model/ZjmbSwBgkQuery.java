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

    /**
     * 姓名
     * @return
     */
   private String xm;

    /**
     * 死亡日期
     * @return
     */
    private String swrq;

    /**
     * 报卡医生姓名
     * @return
     */
    private String jkys;

    /**
     * 死亡数据下发接口用户名
     * @return
     */
    private String userName;

    /**
     * 死亡数据下发接口密码
     * @return
     */
    private String password;

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

    public String getXm() {
        return xm;
    }

    public String getSwrq() {
        return swrq;
    }

    public String getJkys() {
        return jkys;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public void setSwrq(String swrq) {
        this.swrq = swrq;
    }

    public void setJkys(String jkys) {
        this.jkys = jkys;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
