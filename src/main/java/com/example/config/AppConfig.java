package com.example.config;

import com.example.Compiler;
import com.example.Computer;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean
    public Computer computer(Compiler compiler) {
        return new Computer(compiler);
    }

    @Bean
    public Compiler compiler() {
        return new Compiler();
    }
}
