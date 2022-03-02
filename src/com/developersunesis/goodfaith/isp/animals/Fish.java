package com.developersunesis.goodfaith.isp.animals;

import com.developersunesis.goodfaith.isp.Animal;
import com.developersunesis.goodfaith.isp.IAnimal;

public class Fish extends Animal implements IAnimal {
    public Fish(String color, String habitat, String philia) {
        super(color, habitat, philia);
    }

    @Override
    public void move() {
        System.out.println("Move from x to y");
    }

    @Override
    public void walk() {
        throw new UnsupportedOperationException("I definitely can't walk");
    }

    @Override
    public void swim() {
        System.out.println("I love swimming");
    }
}
