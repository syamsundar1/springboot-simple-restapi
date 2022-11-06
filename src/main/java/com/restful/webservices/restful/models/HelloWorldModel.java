package com.restful.webservices.restful.models;

public class HelloWorldModel {
    private String msg;

    public HelloWorldModel(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "HelloWorldModel{" +
                "msg='" + msg + '\'' +
                '}';
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
