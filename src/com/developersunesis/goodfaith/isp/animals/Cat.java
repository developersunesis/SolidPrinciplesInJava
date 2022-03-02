package com.developersunesis.goodfaith.isp.animals;

import com.developersunesis.goodfaith.isp.Animal;
import com.developersunesis.goodfaith.isp.IAnimal;

public class Cat extends Animal implements IAnimal {
    public Cat(String color, String habitat, String philia) {
        super(color, habitat, philia);
    }

    @Override
    public void move() {
        System.out.println("Move from x to y");
    }

    @Override
    public void walk() {
        System.out.println("Running...");
    }

    @Override
    public void swim() {
        throw new UnsupportedOperationException("I definitely can't swim");
    }
}
