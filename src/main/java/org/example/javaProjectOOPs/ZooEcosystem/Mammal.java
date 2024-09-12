package org.example.javaProjectOOPs.ZooEcosystem;

public class Mammal extends Animal {

    public Mammal(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }

    public void eat() {
        System.out.println("Animals eat");
    }

    public void makeSound() {
        System.out.println("Animals make different sounds");
    }

    @Override
    public void displayInformation() {
        System.out.println("Name: " + getName());
        System.out.println("Color: " + getColor());
        System.out.println("Age: " + getAge());
        System.out.println("Weight: " + getWeight() + "lbs");
    }
}
