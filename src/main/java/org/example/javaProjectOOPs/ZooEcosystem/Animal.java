package org.example.javaProjectOOPs.ZooEcosystem;

public abstract class Animal implements AnimalBehavior {

    //Instance variables
    private String name;
    private String color;
    private int age;
    private double weight;

    //Initialize instance variables using constructor
    public Animal(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    //getter
    public String getName() {
        return name;
    }
    public String getColor(){
        return color;
    }
    public int getAge(){
        return age;
    }public double getWeight(){
        return weight;
    }

    //setter
    public void setName(String name){
        this.name=name;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }


    // Implement sleep() from AnimalBehavior
    public void sleep(){
        System.out.println("ZZzzzZZzzz");
    }

    //abstract method for displaying information
    public abstract void displayInformation();
}
