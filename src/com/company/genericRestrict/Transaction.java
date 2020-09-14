package com.company.genericRestrict;

public class Transaction<T extends Account> {
    private T from;
    private T to;
    private int sum;

    Transaction(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public void execute() {
        if (from.getSum() > sum) {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf("Account %s: %d\nAccount %s: %d",from.getId(),from.getSum(),to.getId(),to.getSum());
        } else {
            System.out.println("Transaction is not valid!");
        }
    }
}
