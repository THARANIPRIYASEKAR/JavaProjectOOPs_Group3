package org.example.javaProjectOOPs.ZooEcosystem;

public abstract class Animal implements AnimalBehavior {

    // Implement sleep() from AnimalBehavior
    public void sleep(){

        System.out.println("ZZzzzZZzzz");
    }

    //abstract method
    public abstract void displayInformation();
}



