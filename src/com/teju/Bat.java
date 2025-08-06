package com.teju;

public class Bat extends Animal{
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Bat() {
        super();
    }

    public Bat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+ "Is making noise");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void roam() {
        super.roam();
    }
}
