package org.example.javaProjectOOPs.ZooEcosystem.ZooEcosystem;

public class Eagle extends Bird {

    public Eagle(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }

    public void eat() {
        System.out.println("Eagle eats meat");
    }

    public void makeSound() {
        System.out.println("Eagle screeches");
    }

    public void displayInformation() {
        System.out.println("Species: EAGLE");
        super.displayInformation();
    }
}
