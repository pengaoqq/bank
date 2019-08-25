package cn.goktech.pojo;

import java.math.BigDecimal;

public class Quanxgl {
    private BigDecimal id;

    private Object guanldxlx;

    private String guanldxbs;

    private String guanldxmc;

    private Object quanxid;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Object getGuanldxlx() {
        return guanldxlx;
    }

    public void setGuanldxlx(Object guanldxlx) {
        this.guanldxlx = guanldxlx;
    }

    public String getGuanldxbs() {
        return guanldxbs;
    }

    public void setGuanldxbs(String guanldxbs) {
        this.guanldxbs = guanldxbs == null ? null : guanldxbs.trim();
    }

    public String getGuanldxmc() {
        return guanldxmc;
    }

    public void setGuanldxmc(String guanldxmc) {
        this.guanldxmc = guanldxmc == null ? null : guanldxmc.trim();
    }

    public Object getQuanxid() {
        return quanxid;
    }

    public void setQuanxid(Object quanxid) {
        this.quanxid = quanxid;
    }
}