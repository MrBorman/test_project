package com.company.nasled;

//служащий некоторой компании
public class Employee extends Person{

    private String company;
    protected Employee(String name, String company) {
        super(name);
        this.company = company;
    }
    public String getCompany() {
        return company;
    }

    public void display() {
        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }

}
