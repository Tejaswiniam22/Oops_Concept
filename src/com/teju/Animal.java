package com.teju;

public abstract class Animal {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(){
        System.out.println("This is non parameterized constuctor");
    }
    public Animal(String name){
        this.name=name;
    }
    public void eat(){
        System.out.println("Eat is called");
    }
    public abstract void makeNoise();
    public void sleep()
    {
        System.out.println("com.teju.Dog is sleeping");
    }
    public void roam(){
        System.out.println("Roaming!");
    }
}
