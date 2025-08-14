package com.example.config;

import com.example.Compiler;
import com.example.Computer;
import com.example.Gamingable;
import com.example.Laptop;
import org.springframework.context.annotation.*;

@ComponentScan("com.example")
public class AppConfig {
//
//    @Bean
//    public Gamingable computer(Compiler compiler) {
//        return new Computer(compiler);
//    }
//
//    @Bean
//    @Primary
//    public Gamingable laptop(Compiler compiler) {
//        return new Laptop(compiler);
//    }
//
//    @Bean()
//    public Compiler compiler() {
//        return new Compiler();
//    }
}
