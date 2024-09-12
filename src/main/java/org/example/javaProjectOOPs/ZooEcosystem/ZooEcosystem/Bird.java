package org.example.javaProjectOOPs.ZooEcosystem.ZooEcosystem;

public class Bird extends Animal {

    public Bird(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }

    public void eat() {
        System.out.println("Birds eat");
    }

    public void makeSound() {
        System.out.println("Birds make different sounds");
    }

    @Override
    public void displayInformation() {
        System.out.println("Name: " + getName());
        System.out.println("Color: " + getColor());
        System.out.println("Age: " + getAge());
        System.out.println("Weight: " + getWeight() + "lbs");
    }
}
