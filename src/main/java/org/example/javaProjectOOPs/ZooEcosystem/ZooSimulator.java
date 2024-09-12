package org.example.javaProjectOOPs.ZooEcosystem;

public class ZooSimulator {
    public static void main(String[] args) {

        //Instantiate various animals in a main method
        Animal lion = new Lion("The King", "Brown", 10, 300);
        Animal elephant = new Elephant("Ganesh", "Grey", 2, 2000);
        Animal parrot = new Parrot("Melody", "Green", 10, 0.5);
        Animal eagle = new Eagle("Jack", "Brown", 20, 10);

        // Demonstrate polymorphism
        Animal[] animals = {lion, elephant, parrot, eagle};
        for (Animal animal : animals) {
            animal.displayInformation();
            animal.eat();
            animal.makeSound();
            animal.sleep();
            System.out.println();
        }

        //update lion's weight
        lion.setWeight(400);

        //check if updated
        System.out.println("Updated Weight: " + lion.getWeight() + " lbs");


    }
}
