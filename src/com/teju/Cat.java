package com.teju;

public class Cat extends Animal{
    String name;

    public Cat(){
    super();
    }

    public Cat(String name){
        super(name);
    }
    public void makeNoise(){
        System.out.println("This is cat making meow");
    }

    public void jump(){
        System.out.println(getName() +" is jumping");
    }
}
