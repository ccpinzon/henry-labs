package org.example;

public class Coffee {

    public static CoffeeIngredients calcCoffeeIngredients(String coffeeName, int cup) {
        int espresso = 0, water = 0;

        if ("espresso".equals(coffeeName)) {
            espresso = 30 * cup;
            return new CoffeeIngredients(espresso, 0);
        }

        if ("americano".equals(coffeeName)) {
            espresso = 30 * cup;
            water = 70 * cup;
            return new CoffeeIngredients(espresso, water);
        }

        return new CoffeeIngredients(0, 0);
    }

    public static boolean isValidCoffee(String name) {
        return "espresso".equals(name) || "americano".equals(name) || "mocha".equals(name);
    }
}
