package org.example.javaProjectOOPs.ZooEcosystem;

public class Lion extends Mammal {

    public Lion(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }

    public void eat() {
        System.out.println("Lion eats meat");
    }

    public void makeSound() {
        System.out.println("Lion Roars");
    }

    @Override
    public void displayInformation() {
        System.out.println("Species: LION");
        super.displayInformation();
    }
}
