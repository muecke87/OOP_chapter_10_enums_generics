package com.enums;

public class Main {

    public static void main(String[] args) {
        Year.printTemperature(Season.SUMMER);
        System.out.println(Season.SUMMER.ordinal());

        Season seasons[] = Season.values();

        for(Season season : seasons) {
            System.out.println("Temperaturen " + season.temperature);

        }
    }
}
