package com.piggybank;

public class Nickel extends Money {

    public Nickel(int amount){
        super("Nickel", amount , 0.05);
    }

    public Nickel(){
        super("Nickel", 1, 0.05);
    }
}
