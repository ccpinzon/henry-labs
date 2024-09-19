package org.example;

public class CoffeeIngredients {
    public int espresso;
    public int water;

    public CoffeeIngredients(int espresso, int water) {
        this.espresso = espresso;
        this.water = water;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CoffeeIngredients)) return false;
        CoffeeIngredients other = (CoffeeIngredients) obj;
        return espresso == other.espresso && water == other.water;
    }
}