package com.piggybank;

public abstract class Money {
    int amount;
    double value;
    String name;

    //constructor
    public Money(String name, int amount, double value){
        this.name = name;
        this.amount = amount;
        this.value = value;
    }

    public Money(){
        amount = 1;
    }

    public String getAmount()
    {
        return this.amount + " " + this.name;
    }

    public double getValue()
    {
        return value;
    }


    public double getBalance()
    {
        return value * amount;
    }
}
