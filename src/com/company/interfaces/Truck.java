package com.company.interfaces;

public class Truck implements Vechicle {

    String name;
    int mass;

    public Truck(String name, int mass) {
        this.name = name;
        this.mass = mass;
    }

    @Override
    public void print() {
        System.out.printf("Truck: %s\t Max mass: %dkg\n", name, mass);
    }
    public int getMass() {
        return mass;
    }
}
