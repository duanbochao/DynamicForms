package com.bean.input;

public class Col {
  private Integer span;
  private Integer labelWidth;

  public Col(Integer span, Integer labelWidth) {
    this.span = span;
    this.labelWidth = labelWidth;
  }

  public Col() {
  }

  public Integer getSpan() {
    return span;
  }

  public void setSpan(Integer span) {
    this.span = span;
  }

  public Integer getLabelWidth() {
    return labelWidth;
  }

  public void setLabelWidth(Integer labelWidth) {
    this.labelWidth = labelWidth;
  }
}
