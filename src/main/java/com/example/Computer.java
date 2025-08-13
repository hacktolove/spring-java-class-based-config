package com.example;



public class Computer implements Gamingable {

    private int cores ;

    private  Compiler compiler;

    public Computer(Compiler compiler) {
        this.compiler = compiler;
    }

    @Override
    public void playGame() {
        System.out.println("Playing from Computer");
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
