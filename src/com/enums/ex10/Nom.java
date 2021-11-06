package com.enums.ex10;

public class Nom {
    Geschlecht geschlecht;
    String name;

    public Nom(Geschlecht geschlecht, String name) {
        this.geschlecht = geschlecht;
        this.name = name;
    }

    public String mitArtikel(Fall fall, boolean bestimmt) {
        return (bestimmt ? fall.getBestimmterArtikel(this.geschlecht) : fall.getUnbestimmterArtikel(this.geschlecht)) + " " + this.name ;
    }
}
