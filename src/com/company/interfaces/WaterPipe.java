package com.company.interfaces;

public class WaterPipe implements Stateable {

    private static int n;
    public void setState(int n) {
        this.n = n;
    }
    @Override
    public void printState() {
        if (n == OPEN) {
            System.out.println("Water is opened");
        } else if (n == CLOSED) {
            System.out.println("Water is closed");
        } else {
            System.out.println("State is undefined");
        }
    }

    public void getState() {
        if (n == OPEN) {
            System.out.println("Water is opened");
        } else if (n == CLOSED) {
            System.out.println("Water is closed");
        } else {
            System.out.println("State is undefined");
        }
    }
}
