package com.enums;

import com.enums.Season;

public class Year {
    public static void printTemperature(Season season) {
        System.out.println("It's " + season.temperature);

    }
    public static void printTemperatures() {
        for(Season season : Season.values()) {
            System.out.println("Temperaturen " + season.temperature);

        }

    }
}
