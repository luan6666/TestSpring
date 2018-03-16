package com.ldx_first.demo_first.entity;

import java.io.Serializable;

public class Name implements Serializable {
    private Integer personId;

    private String name;

    private Integer phoneNum;

    private Integer password;

    private String remake;

    private static final long serialVersionUID = 1L;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake == null ? null : remake.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", personId=").append(personId);
        sb.append(", name=").append(name);
        sb.append(", phoneNum=").append(phoneNum);
        sb.append(", password=").append(password);
        sb.append(", remake=").append(remake);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}