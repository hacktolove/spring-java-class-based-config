package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Computer implements Gamingable {

    @Value("7")
    private int cores ;

    @Autowired
    private  Compiler compiler;

    public Computer() {

    }

    @Override
    public void playGame() {
        System.out.println("Playing from Computer");
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
