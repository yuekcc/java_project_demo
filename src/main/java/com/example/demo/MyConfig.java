package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyConfig {
    @Value("${my.var}")
    private String myVar;

    public String getMyVar() {
        return myVar;
    }
}