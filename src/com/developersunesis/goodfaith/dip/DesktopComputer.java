package com.developersunesis.goodfaith.dip;

public class DesktopComputer {

    private Monitor monitor;
    private Keyboard keyboard;

    public DesktopComputer() {
        // tightly coupled, and we don't have dynamism over these properties
        monitor = new Monitor();
        keyboard = new Keyboard();
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void turnOn(){
        System.out.println("Turn the computer on!");
    }
}
