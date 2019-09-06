package com.piggybank;

public class Penny extends Money {

    public Penny(int amount){
        super("Penny", amount, 0.01);
    }

    public Penny(){
        super("penny", 1, 0.01);
    }
}
