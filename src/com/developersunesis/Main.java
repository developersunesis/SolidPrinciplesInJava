package com.developersunesis;

import com.developersunesis.corrections.srp.CupCookConverter;
import com.developersunesis.goodfaith.ICup;
import com.developersunesis.violations.JCup;

public class Main {

    public static void main(String[] args) {

        // Single Responsibility Principle
        S();

    }

    private static void S(){
        ICup iCup = new ICup(5, 2, 5);
        System.out.println(iCup.volume());

        JCup jCup = new JCup(5, 2, 5);
        System.out.println(jCup.volume());

        String[] foodIngredients = { "Rice", "Salt", "Water", "Onions" };
        jCup.cook(foodIngredients);

        // Correction:: create a converter for cup to be extended for cooking use
        CupCookConverter cupCookConverter = new CupCookConverter(iCup);
        cupCookConverter.cook(foodIngredients);
    }
}
