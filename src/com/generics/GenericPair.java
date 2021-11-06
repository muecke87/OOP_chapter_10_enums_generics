package com.generics;

public class GenericPair<T> {
    private T l, r;
    public GenericPair(T l, T r) {
        this.l = l;
        this.r = r;
    }

    public T getL() {
        return l;
    }

    public Object getR() {
        return r;
    }

    public String toString() {
        return "(l, r) = (" + l + "," + r + ")";
    }

}
