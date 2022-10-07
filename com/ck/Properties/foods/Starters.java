package com.ck.Properties.foods;

public enum Starters {
    TOMATO_SOUP ("Tomato Soup"),
    FRENCH_ONION_SOUP ("French Onion Soup");

    private String value;

    Starters(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.getValue();
    }
}
