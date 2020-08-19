package com.company.nasled;

//Класс клиента банка
public class Client extends Person{
    private int sum;
    private String bank;

    protected Client(int sum, String bank, String name) {
        super(name);
        this.sum = sum;
        this.bank = bank;
    }

    public int getSum() {
        return sum;
    }

    public String getBank() {
        return bank;
    }

    public void display() {
        System.out.printf("Client %s has account in bank %s \n", super.getName(),bank);
    }

}
