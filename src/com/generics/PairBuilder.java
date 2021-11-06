package com.generics;

public class PairBuilder {
    public static void main(String... args) {
        Sock s1 = new Sock(42);
        Sock s2 = new Sock(42);
        Pair socksPair = new Pair(s1, s2);
        System.out.println("1. Paar " + socksPair);

        Card c1 = new Card("König");
        Card c2 = new Card("Zehn");

        // typecast notwendig, da getL object liefert
        Sock sock = (Sock) socksPair.getL();
        System.out.println(sock.size);

        // erlaubt, s1 und c1 sind vom type object
        var strangePair = new Pair(s1, c1);

        // classCastException zur laufzeit!!! s1 kann nicht in card gecasted werden
//        Card card = (Card) strangePair.getL();

        GenericPair<Sock> genericSocksPair = new GenericPair<>(s1, s2);

        // kein typecast notwendig da type T als 'Sock' definiert wurde
        Sock sock2 = genericSocksPair.getL();
        System.out.println(sock2.size);
    }
}
