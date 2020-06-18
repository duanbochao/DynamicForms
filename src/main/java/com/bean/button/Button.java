package com.bean.button;

import java.util.ArrayList;
import java.util.List;
/**
 * 封装el-button
 */
public class Button {
  private String type;
  private List<Emit> emit;
  private String emitPrefix;
  private List<String> children;
  private Props props;
  private Col col;
  private Integer orderNum; //排列顺序

  public Button() {
  }

  public Button(Integer orderNum, String injectName, String btnName) {

    Emit e = new Emit();
    e.setName("click");
    ArrayList<String> inject = new ArrayList<>();
    inject.add(injectName);
    e.setInject(inject);
    ArrayList<Emit> emits = new ArrayList<>();
    emits.add(e);
    this.emit=emits;
    this.type = "el-button";
    this.emitPrefix = "prefix1";
    ArrayList<String> c = new ArrayList<>();
    c.add(btnName);
    this.children=c;
    Props props = new Props("mini");
    this.props=props;
    Col col = new Col(2);
    this.col=col;
    this.orderNum=orderNum;
  }


  public Integer getOrderNum() {
    return orderNum;
  }

  public void setOrderNum(Integer orderNum) {
    this.orderNum = orderNum;
  }

  public Props getProps() {
    return props;
  }

  public void setProps(Props props) {
    this.props = props;
  }


  public Col getCol() {
    return col;
  }

  public void setCol(Col col) {
    this.col = col;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public List<Emit> getEmit() {
    return emit;
  }

  public void setEmit(List<Emit> emit) {
    this.emit = emit;
  }

  public String getEmitPrefix() {
    return emitPrefix;
  }

  public void setEmitPrefix(String emitPrefix) {
    this.emitPrefix = emitPrefix;
  }

  public List<String> getChildren() {
    return children;
  }

  public void setChildren(List<String> children) {
    this.children = children;
  }
}
