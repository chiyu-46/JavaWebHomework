package com.beans;

import java.util.List;

public class ListTestBean {
    private List<String> values;
    public List<String> getValues() {
        return values;
    }
    public void setValues(List<String> values) {
        this.values = values;
    }
    public void sayHello() {
        System.out.println(values.toString());

    }
}
