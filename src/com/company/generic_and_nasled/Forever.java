package com.company.generic_and_nasled;

public class Forever<T> {
    private T _id;

    public Forever(T id) {
        _id = id;
    }

    public T getId() {
        return _id;
    }
}
