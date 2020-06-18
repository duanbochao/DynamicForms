package com.bean.Select;

public class Props {

  private String size;
  private Integer setMaxlength;


  public Props() {
  }

  public Integer getSetMaxlength() {
    return setMaxlength;
  }

  public void setSetMaxlength(Integer setMaxlength) {
    this.setMaxlength = setMaxlength;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public Props(String size) {
    this.size = size;
  }
}
