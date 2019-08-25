package cn.goktech.pojo;

public class Quanx {
    private Object id;

    private String quanxmc;

    private String quanxbz;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getQuanxmc() {
        return quanxmc;
    }

    public void setQuanxmc(String quanxmc) {
        this.quanxmc = quanxmc == null ? null : quanxmc.trim();
    }

    public String getQuanxbz() {
        return quanxbz;
    }

    public void setQuanxbz(String quanxbz) {
        this.quanxbz = quanxbz == null ? null : quanxbz.trim();
    }
}