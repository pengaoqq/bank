package cn.goktech.pojo;

public class Caid {
    private String id;

    private String caidmc;

    private String caidbz;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCaidmc() {
        return caidmc;
    }

    public void setCaidmc(String caidmc) {
        this.caidmc = caidmc == null ? null : caidmc.trim();
    }

    public String getCaidbz() {
        return caidbz;
    }

    public void setCaidbz(String caidbz) {
        this.caidbz = caidbz == null ? null : caidbz.trim();
    }
}