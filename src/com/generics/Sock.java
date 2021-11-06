package com.generics;

public class Sock extends Clothing implements Printable {
    public Sock(double size) {
        super(size);
    }

    @Override
    public String toString() {
        return "Socke in Grösse " + size;
    }

    @Override
    public void print() {

    }
}



