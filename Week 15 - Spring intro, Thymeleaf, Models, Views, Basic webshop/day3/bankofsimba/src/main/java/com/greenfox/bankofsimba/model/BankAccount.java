package com.greenfox.bankofsimba.model;

import java.util.Formatter;

public class BankAccount {

    private String name;
    private double balance;
    private String animalType;

    public BankAccount(String name, double balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public String getBalance() {
        Formatter formatter = new Formatter();
        return  formatter.format("%.2f",balance).toString();

    }

    public String getAnimalType() {
        return animalType;
    }


}
