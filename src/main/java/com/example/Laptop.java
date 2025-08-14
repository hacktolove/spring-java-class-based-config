package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Gamingable {

    @Value("5")
    private int cores ;

    @Autowired
    private  Compiler compiler;


    public Laptop() {

    }

    @Override
    public void playGame() {
        System.out.println("Playing from Laptop");
    }

    @Override
    public void compile() {
        this.compiler.compile();
    }

    public void setCompiler(Compiler compiler) {
        this.compiler = compiler;
    }


    public Compiler getCompiler() {
        return compiler;
    }



    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        System.out.println("Setting cores");
        this.cores = cores;
    }


}
