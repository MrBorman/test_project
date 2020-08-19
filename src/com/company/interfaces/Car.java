package com.company.interfaces;

public class Car implements Vechicle {
    String name;
    int countPassegers;
    int probeg;

    public Car(String name, int countPassegers, int probeg) {
        this.name = name;
        this.countPassegers = countPassegers;
        this.probeg = probeg;
    }

    @Override
    public void print() {
        System.out.printf("Car: %s\tyou can catch %d people\tProbeg vsego %s\n",name,countPassegers,probeg);
    }

    public int getProbeg() {
        return probeg;
    }

    public void setProbeg(int probeg) {
        this.probeg = probeg;
    }
}
