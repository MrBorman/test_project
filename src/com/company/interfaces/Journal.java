package com.company.interfaces;

public class Journal implements Printable {
    private String name;
    public Journal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public void print() {
        System.out.printf("The journal \"%s\"\n",name);
    }
}
