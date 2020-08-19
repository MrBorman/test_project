package com.company.interfaces;

public class Book implements Printable{
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    @Override
    public void print() {
        System.out.printf("The book \"%s\"\tauthor \"%s\"\n",name,author);
    }

    public interface BookPrintable {
        int MDDR = 1;
        int UISM = 0;

        void printSystem(int n);
    }
}
