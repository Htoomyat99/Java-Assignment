package com.soft.getterExample;

public class Day9 {
    public static void main(String[] args) {
        Animal dog = new Animal("PUPPY", 22, "Ygn");
        Animal cat = new Animal("PUSSY", 19, "MDY");

        System.out.println(dog.getName() + " " +  dog.getAge() + " " + dog.getAddress());
        System.out.println(cat.getName() + " " + cat.getAge() + " " + cat.getAddress());

        dog.eat();
        dog.sleep();
        dog.move();
        dog.makeSound();

        cat.eat();
        cat.sleep();
        cat.move();
        cat.makeSound();
    }
}
