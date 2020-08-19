package com.company.interfaces;

public class ChangeSystem implements Book.BookPrintable {

    @Override
    public void printSystem(int n) {
        if (n == MDDR) {
            System.out.println("Currently used MDDR");
        } else if (n == UISM) {
            System.out.println("Currently used UISM");
        } else {
            System.out.println("Currently used ESB");
        }
    }
}
