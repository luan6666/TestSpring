package com.ldx_first.demo_first.entity;

public class Diary {
    private Integer iddiary;

    private String os;

    private String ip;

    private String browser;

    private String createtime;

    private String name;

    private String diarycontent;

    public Integer getIddiary() {
        return iddiary;
    }

    public void setIddiary(Integer iddiary) {
        this.iddiary = iddiary;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os == null ? null : os.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser == null ? null : browser.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDiarycontent() {
        return diarycontent;
    }

    public void setDiarycontent(String diarycontent) {
        this.diarycontent = diarycontent == null ? null : diarycontent.trim();
    }
}