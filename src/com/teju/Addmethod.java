package com.teju;

public class Addmethod {

    public int Varag(Integer... inte){
        int sum=0;
        for(int i:inte){
            sum+=i;
        }
        return sum;
    }
}
