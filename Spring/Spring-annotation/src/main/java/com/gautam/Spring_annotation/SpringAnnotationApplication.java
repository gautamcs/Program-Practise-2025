package com.gautam.Spring_annotation;

import com.gautam.Spring_annotation.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAnnotationApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringAnnotationApplication.class, args);
        //PizzaController bean = context.getBean(PizzaController.class);
        PizzaController bean = (PizzaController) context.getBean("pizza");
        System.out.println(bean.getPizza());
    }

}
