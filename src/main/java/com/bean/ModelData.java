package com.bean;

public class ModelData {
  private String name;
  private String nameZh;
  private String type;


  public ModelData(String name, String nameZh, String type) {
    this.name = name;
    this.nameZh = nameZh;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNameZh() {
    return nameZh;
  }

  public void setNameZh(String nameZh) {
    this.nameZh = nameZh;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
