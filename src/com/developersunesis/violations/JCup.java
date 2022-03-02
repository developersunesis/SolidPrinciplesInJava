package com.developersunesis.violations;

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

    public void cook(String... foodItems){
        for(String foodItem : foodItems){
            System.out.println(foodItem);
        }
    }
}
