package com.example;

import org.springframework.stereotype.Component;

@Component
public interface Gamingable {

    void playGame();
    void compile();

    int getCores();
}
