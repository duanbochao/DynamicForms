package com.bean.input;

public class Validate {
  private  boolean required;
  private String message;
  private String trigger;

  public Validate() {
  }

  public Validate(boolean required, String message, String trigger) {
    this.required = required;
    this.message = message;
    this.trigger = trigger;
  }

  public boolean isRequired() {
    return required;
  }

  public void setRequired(boolean required) {
    this.required = required;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getTrigger() {
    return trigger;
  }

  public void setTrigger(String trigger) {
    this.trigger = trigger;
  }
}
