package com.teju;

public class Parrot extends Bird implements Flayble{
    public Parrot() {
    }

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+ " is making noise");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void fly() {
        System.out.println(getName()+ " This can fly");
    }

    public void willfly(){
        System.out.println("This flies");
    }

public void flyy(){
    Flayble f = () -> System.out.println("This is a good expression");
    f.willfly();
}



    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void roam() {
        super.roam();
    }
}

