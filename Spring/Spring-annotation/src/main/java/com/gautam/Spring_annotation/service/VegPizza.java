package com.gautam.Spring_annotation.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class VegPizza implements Pizza {
    public String getPizza() {
        return " Pure & Fresh Veg Pizza!!";
    }
}
