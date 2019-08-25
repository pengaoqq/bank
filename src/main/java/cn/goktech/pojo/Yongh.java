package cn.goktech.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Yongh {
    private Object id;

    private String yonghzh;

    private String yonghxm;

    private String yonghbz;

    private String yonghmm;

    private Date yonghdlzhsj;

    private BigDecimal yonghdlcs;

    private String yonghip;

    private Object zhanghzt;

    private Date zhucsj;

    private Object jiaosid;

    private String bumid;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getYonghzh() {
        return yonghzh;
    }

    public void setYonghzh(String yonghzh) {
        this.yonghzh = yonghzh == null ? null : yonghzh.trim();
    }

    public String getYonghxm() {
        return yonghxm;
    }

    public void setYonghxm(String yonghxm) {
        this.yonghxm = yonghxm == null ? null : yonghxm.trim();
    }

    public String getYonghbz() {
        return yonghbz;
    }

    public void setYonghbz(String yonghbz) {
        this.yonghbz = yonghbz == null ? null : yonghbz.trim();
    }

    public String getYonghmm() {
        return yonghmm;
    }

    public void setYonghmm(String yonghmm) {
        this.yonghmm = yonghmm == null ? null : yonghmm.trim();
    }

    public Date getYonghdlzhsj() {
        return yonghdlzhsj;
    }

    public void setYonghdlzhsj(Date yonghdlzhsj) {
        this.yonghdlzhsj = yonghdlzhsj;
    }

    public BigDecimal getYonghdlcs() {
        return yonghdlcs;
    }

    public void setYonghdlcs(BigDecimal yonghdlcs) {
        this.yonghdlcs = yonghdlcs;
    }

    public String getYonghip() {
        return yonghip;
    }

    public void setYonghip(String yonghip) {
        this.yonghip = yonghip == null ? null : yonghip.trim();
    }

    public Object getZhanghzt() {
        return zhanghzt;
    }

    public void setZhanghzt(Object zhanghzt) {
        this.zhanghzt = zhanghzt;
    }

    public Date getZhucsj() {
        return zhucsj;
    }

    public void setZhucsj(Date zhucsj) {
        this.zhucsj = zhucsj;
    }

    public Object getJiaosid() {
        return jiaosid;
    }

    public void setJiaosid(Object jiaosid) {
        this.jiaosid = jiaosid;
    }

    public String getBumid() {
        return bumid;
    }

    public void setBumid(String bumid) {
        this.bumid = bumid == null ? null : bumid.trim();
    }
}