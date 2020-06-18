package com.bean.input;

public class Props {

  private String size;
  private Integer maxlength;


  public Props(String size, Integer maxlength) {
    this.size = size;
    this.maxlength = maxlength;
  }


  public Props() {
  }

  public Integer getMaxlength() {
    return maxlength;
  }

  public void setMaxlength(Integer maxlength) {
    this.maxlength = maxlength;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }
}
