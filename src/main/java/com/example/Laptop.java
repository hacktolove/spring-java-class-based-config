package com.example;



public class Laptop implements Gamingable {

    private int cores ;

    private  Compiler compiler;


    public Laptop() {
    }

    @Override
    public void playGame() {
        System.out.println("Playing from Laptop");

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
