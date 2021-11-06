package com.enums;

public enum Season {
    SPRING("Warm"),
    SUMMER("Hot"),
    FALL("Cool"),
    WINTER("Cold");

    public String temperature;

    Season(String temperature) {
        this.temperature = temperature;
    }
}
