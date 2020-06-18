package com.bean;

public class Table {
  private String name;
  private String nameZh;
  private String type;
  private Integer length;
  private boolean lockLength;
  private boolean valueIsNull;
  private boolean valueExtend;
  private boolean parentIdExtend;
  private String diction;
  private boolean checked;
  private Integer span;


  public Table(String name, String nameZh, String type, Integer length, boolean lockLength, boolean valueIsNull, boolean valueExtend, boolean parentIdExtend, String diction,boolean checked,Integer span) {
    this.name = name;
    this.nameZh = nameZh;
    this.type = type;
    this.length = length;
    this.lockLength = lockLength;
    this.valueIsNull = valueIsNull;
    this.valueExtend = valueExtend;
    this.parentIdExtend = parentIdExtend;
    this.diction = diction;
    this.checked=checked;
    this.span=span;
  }


  public Integer getSpan() {
    return span;
  }

  public void setSpan(Integer span) {
    this.span = span;
  }

  public String getDiction() {
    return diction;
  }

  public boolean isChecked() {
    return checked;
  }

  public void setChecked(boolean checked) {
    this.checked = checked;
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

  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public boolean isLockLength() {
    return lockLength;
  }

  public void setLockLength(boolean lockLength) {
    this.lockLength = lockLength;
  }

  public boolean isValueIsNull() {
    return valueIsNull;
  }

  public void setValueIsNull(boolean valueIsNull) {
    this.valueIsNull = valueIsNull;
  }

  public boolean isValueExtend() {
    return valueExtend;
  }

  public void setValueExtend(boolean valueExtend) {
    this.valueExtend = valueExtend;
  }

  public boolean isParentIdExtend() {
    return parentIdExtend;
  }

  public void setParentIdExtend(boolean parentIdExtend) {
    this.parentIdExtend = parentIdExtend;
  }

  public String isDiction() {
    return diction;
  }

  public void setDiction(String diction) {
    this.diction = diction;
  }


}
