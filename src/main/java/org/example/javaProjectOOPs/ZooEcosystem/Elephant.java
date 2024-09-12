package org.example.javaProjectOOPs.ZooEcosystem;

public class Elephant extends Mammal{

    public Elephant(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }

    public void eat() {
        System.out.println("Elephant eats plants");
    }

    public void makeSound() {
        System.out.println("Elephant Trumpets");
    }

    public void displayInformation() {
        System.out.println("Species: ELEPHANT");
        super.displayInformation();
    }
}
