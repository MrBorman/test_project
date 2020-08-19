package com.company.interfaces;

public interface Stateable {
    int OPEN = 1;
    int CLOSED = 0;

    default void printState() {

    };
}
