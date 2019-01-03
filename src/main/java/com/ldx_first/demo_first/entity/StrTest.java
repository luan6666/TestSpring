package com.ldx_first.demo_first.entity;

public class StrTest {
    String name;
    String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "StrTest{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
