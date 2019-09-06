package com.piggybank;

public class Dollar extends Money {

    public Dollar(int amount){
        super("Dollar", amount, 1.00);
    }

    public Dollar(){
        super("Dollar", 1, 1.00);
    }

    @Override
    public String toString()
    {
        return "$" + amount;
    }
}
