package com.sfg.withoutspring;

import com.sfg.withoutspring.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class WithoutspringApplication {

  public static void main(String[] args) {
    ApplicationContext applicationContext = SpringApplication.run(WithoutspringApplication.class, args);
    MyController myController = (MyController) applicationContext.getBean("myController");
    String greeting = myController.sayHello();
    System.out.println(greeting);
  }
  // Here its application context used, application context is equal to the Spring application.run. The controller here
  // uses application context to get bean and method is called.
}
