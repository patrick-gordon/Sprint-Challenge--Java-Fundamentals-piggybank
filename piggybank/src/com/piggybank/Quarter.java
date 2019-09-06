package com.piggybank;

public class Quarter extends Money{

    public Quarter(int amount){
        super("Quarter", amount, 0.25);
    }

    public Quarter(){
        super("Quarter", 1, 0.25);
    }
}
