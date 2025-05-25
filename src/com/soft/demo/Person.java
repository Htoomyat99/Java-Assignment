package com.soft.demo;

public class Person {
  public String name;
  public String address;
  public  Integer age;
  public Integer passowrd;
  public double height;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", passowrd=" + passowrd +
                '}';
    }
}
