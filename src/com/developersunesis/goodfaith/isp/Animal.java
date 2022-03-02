package com.developersunesis.goodfaith.isp;

public class Animal {
    private String color;
    private String habitat;
    private String philia;

    public Animal(String color, String habitat, String philia) {
        this.color = color;
        this.habitat = habitat;
        this.philia = philia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getPhilia() {
        return philia;
    }

    public void setPhilia(String philia) {
        this.philia = philia;
    }
}
