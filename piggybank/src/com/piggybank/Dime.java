package com.piggybank;

public class Dime extends Money {

    // KEEP THINGS IN SAME ORDER!!!
    public Dime(int amount){
        super("Dime", amount, 0.10  );
    }

    public Dime(){
        super("Dime", 1, 0.10);
    }
}
