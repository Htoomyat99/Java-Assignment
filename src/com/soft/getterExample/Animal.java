package com.soft.getterExample;

public class Animal {
    private String name;
    private double age;
    private String address;

    public  Animal(String name, double age,String address) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName (){
        return name;
    }

    public double getAge () {
        return age;
    }

    public String getAddress () {
        return address;
    }

    public void eat () {
        System.out.println(name + " is eating");
    }

    public void sleep () {
        System.out.println(name + " is sleeping");
    }

    public void move () {
        System.out.println(name + " is moving");
    }

    public void makeSound () {
        System.out.println(name + " is making sound");
    }
}
