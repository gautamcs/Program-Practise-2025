package com.gautam.Spring_annotation.config;

import com.gautam.Spring_annotation.controller.PizzaController;
import com.gautam.Spring_annotation.service.NonVegPizza;
import com.gautam.Spring_annotation.service.Pizza;
import com.gautam.Spring_annotation.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Pizza vegPizza() {
        return new VegPizza();
    }

    @Bean
    public Pizza nonVegPizza() {
        return new NonVegPizza();
    }

    @Bean
    public PizzaController pizzaController() {
        return new PizzaController(vegPizza());
    }
}
