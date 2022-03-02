package com.developersunesis.corrections.srp;

import com.developersunesis.goodfaith.ICup;

import java.util.Arrays;

public class CupCookConverter {

    private final ICup iCup;

    public CupCookConverter(ICup iCup){
        this.iCup = iCup;
    }

    public void cook(String... foodItems){
        for(int i = 0; i < iCup.volume(); i++) {
            Arrays.stream(foodItems).forEach(System.out::println);
        }
    }
}
