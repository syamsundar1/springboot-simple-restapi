package com.restful.webservices.restful.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class SomeFiltering {
    private String feild1;
    private String feild2;
    @JsonIgnore
    private String feild3;

    public String getFeild1() {
        return feild1;
    }

    public void setFeild1(String feild1) {
        this.feild1 = feild1;
    }

    public String getFeild2() {
        return feild2;
    }

    public void setFeild2(String feild2) {
        this.feild2 = feild2;
    }

    public String getFeild3() {
        return feild3;
    }

    public void setFeild3(String feild3) {
        this.feild3 = feild3;
    }

    public SomeFiltering(String feild1, String feild2, String feild3) {
        this.feild1 = feild1;
        this.feild2 = feild2;
        this.feild3 = feild3;
    }


}
