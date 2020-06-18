package com.bean.input;

import java.util.ArrayList;
import java.util.List;

public class Input {


  private String type;
  private String title;
  private String field;
  private String value;
  private Col col;
  private Props props;
  private List<Validate> validate;
  private Integer orderNum; //排列顺序


  public Input() {
  }

  //需要校验信息的输入框
  public Input(Integer orderNum, String title, String field, String value, Integer span,String message) {
    List<Validate> validate =new ArrayList<>();
    Validate vd = new Validate();
    vd.setRequired(true);
    vd.setMessage("请输入"+message);
    vd.setTrigger("blur");
    validate.add(vd);
    this.orderNum=orderNum;
    this.type = "input";
    this.title = title;
    this.field = field;
    this.value = value;
    Col col = new Col();

    col.setSpan(span);
    this.col = col;
    Props p = new Props();
    p.setSize("mini");
    this.props = p;
    this.validate = validate;
  }


  public Integer getOrderNum() {
    return orderNum;
  }

  public void setOrderNum(Integer orderNum) {
    this.orderNum = orderNum;
  }

  //不需要校验信息的输入框
  public Input(Integer orderNum, String title, String field, String value, Integer span) {

    this.orderNum=orderNum;
    this.type = "input";
    this.title = title;
    this.field = field;
    this.value = value;
    Col col = new Col();
    col.setSpan(span);
    this.col = col;
    Props p = new Props();
    p.setSize("mini ");
    this.props = p;
  }






  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Col getCol() {
    return col;
  }

  public void setCol(Col col) {
    this.col = col;
  }

  public Props getProps() {
    return props;
  }

  public void setProps(Props props) {
    this.props = props;
  }

  public List<Validate> getValidate() {
    return validate;
  }

  public void setValidate(List<Validate> validate) {
    this.validate = validate;
  }
}
