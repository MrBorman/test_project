package com.company.nasled;

//Класс человека
public class Person {

    private String name;
    protected Person(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void display() {
        System.out.printf("Person %s \n", name);
    }
    public void dontUsed() {}
}
