package com.piggybank;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        DecimalFormat fp = new DecimalFormat("$###,###.00");
        double balance = 0;
        ArrayList<Money> piggyBankList = new ArrayList<Money>();
        piggyBankList.add(new Dime(7));
        piggyBankList.add(new Nickel(3));
        piggyBankList.add(new Penny(10));
        piggyBankList.add(new Dollar(5));
        piggyBankList.add(new Quarter());
        piggyBankList.add(new Dollar());
        piggyBankList.add(new Dime());

        for ( i = 0; i < piggyBankList.size(); i++){
            System.out.println(piggyBankList.get(i).toString());
        }

        for ( i = 0; i < piggyBankList.size(); i++){
            balance += piggyBankList.get(i).getBalance();
        }

        System.out.println();
        System.out.println("The piggy bank holds " + fp.format(balance));

    }
}
