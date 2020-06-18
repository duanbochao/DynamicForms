package com.bean.button;

import java.util.List;

public class Emit {

  private String name;
  private List<String> inject;

  public Emit() {
  }

  public Emit(String name, List<String> inject) {
    this.name = name;
    this.inject = inject;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getInject() {
    return inject;
  }

  public void setInject(List<String> inject) {
    this.inject = inject;
  }
}
