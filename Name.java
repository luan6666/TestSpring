package com.my.db;

public class Name {
  private Long person_id;
  private String name;
  private Long phone_num;
  private Long password;
  private String remake;

  public Long getPerson_id() {
    return person_id;
  }

  public void setPerson_id(Long person_id) {
    this.person_id = person_id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getPhone_num() {
    return phone_num;
  }

  public void setPhone_num(Long phone_num) {
    this.phone_num = phone_num;
  }

  public Long getPassword() {
    return password;
  }

  public void setPassword(Long password) {
    this.password = password;
  }

  public String getRemake() {
    return remake;
  }

  public void setRemake(String remake) {
    this.remake = remake;
  }
}
