package com.gautam.Spring_annotation.controller;

import com.gautam.Spring_annotation.service.Pizza;
import com.gautam.Spring_annotation.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("pizza")
public class PizzaController {

    // Field Injection
//    @Autowired // Must required otherwise NullPointerException
//    private VegPizza vegPizza;

    //Constructor Injection
    //@Autowired // Can be Optional here
//    public PizzaController(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    // Setter Injection

    //    @Autowired // // Must required otherwise NullPointerException
//    public void setVegPizza(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    //@Autowired

    private Pizza pizza;

    public PizzaController(@Qualifier("nonVegPizza") Pizza pizza) {
        this.pizza = pizza;
    }
    public String getPizza() {
        //return " Fresh Pizza!!";
        return pizza.getPizza();
    }
}
