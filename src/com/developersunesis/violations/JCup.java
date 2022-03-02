package com.developersunesis.violations;

import java.util.Arrays;

public class JCup {

    private int length;
    private int breadth;
    private int height;

    public JCup(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    /* Getters and Setters */
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int volume() {
        return length * breadth * height;
    }

    public void cook(String... foodItems){
        for(int i = 0; i < volume(); i++) {
            Arrays.stream(foodItems).forEach(System.out::println);
        }
    }
}
