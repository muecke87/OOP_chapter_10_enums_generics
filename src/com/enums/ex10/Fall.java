package com.enums.ex10;

public enum Fall {
    NOMINATIV, GENITIV, DATIV, AKKUSATIV;

    private static final String[][] bestimmteArtikel = {
            {"der", "die", "das"},
            {"des", "der", "des"},
            {"dem", "der", "dem"},
            {"den", "die", "das"}
    };

    private static final String[][] unbestimmteArtikel = {
            {"ein", "eine", "ein"},
            {"eines", "einer", "eines"},
            {"einem", "einer", "einem"},
            {"einen", "eine", "ein"}
    };

    public String getBestimmterArtikel(Geschlecht geschlecht) {
        return bestimmteArtikel[this.ordinal()][geschlecht.ordinal()];
    }

    public String getUnbestimmterArtikel(Geschlecht geschlecht) {
        return unbestimmteArtikel[this.ordinal()][geschlecht.ordinal()];
    }
}
