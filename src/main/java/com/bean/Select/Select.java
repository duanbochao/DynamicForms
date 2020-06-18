package com.bean.Select;


import java.util.List;

public class Select {
  private String type;
  private String field;
  private String title;
  private List<String> value;
  private List<Options> options;
  private Props props;
  private Col col;


  public Select() {
  }

  public Select(String field, String title, Integer span, List<String> value, List<Options> options) {
    Col col = new Col();
    col.setSpan(span);
    this.type = "select";
    this.field = field;
    this.title = title;
    this.value = value;
    this.options = options;
    Props props = new Props("mini");
    this.props=props;
    this.col=col;
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

  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public List<String> getValue() {
    return value;
  }

  public void setValue(List<String> value) {
    this.value = value;
  }

  public List<Options> getOptions() {
    return options;
  }

  public void setOptions(List<Options> options) {
    this.options = options;
  }
}
