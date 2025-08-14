package com.example;

import com.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Gamingable computer = context.getBean(Gamingable.class);

        computer.compile();
        computer.playGame();

        System.out.println("Your PC has " + computer.getCores() + " cores");

//        Computer computer = context.getBean("computer" , Computer.class);

//        computer.playGame();
//        computer.getCompiler().compile();

    }
}
