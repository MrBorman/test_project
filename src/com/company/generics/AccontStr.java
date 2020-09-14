package com.company.generics;

public class AccontStr implements Accountable<String>{

    private String id;
    private int sum;

    AccontStr(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }
    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getSum() {
        return sum;
    }

    @Override
    public void setSum(int sum) {
        this.sum = sum;
    }
}
