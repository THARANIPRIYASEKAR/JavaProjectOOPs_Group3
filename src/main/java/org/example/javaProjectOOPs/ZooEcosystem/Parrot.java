package org.example.javaProjectOOPs.ZooEcosystem;

public class Parrot extends Bird{

    public Parrot(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }

    public void eat() {
        System.out.println("Parrot eats seeds");
    }

    public void makeSound() {
        System.out.println("Parrot squawks");
    }

    public void displayInformation() {
        System.out.println("Species: PARROT");
        super.displayInformation();
    }
}
