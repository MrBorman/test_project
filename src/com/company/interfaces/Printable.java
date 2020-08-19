package com.company.interfaces;

public interface Printable {

    default void print() {
        System.out.println("Undefined print");
    };

    default void defaultPrint() {
        System.out.println("Default print");
    }

    static void author(String name) {
        System.out.printf("This program wrote by %s\n",name);
    }
}
