package com.greenfox.bankofsimba.model;

import java.util.Formatter;

public class BankAccount {

    private static int nextId = 0;
    private int id;
    private String name;
    private double balance;
    private String animalType;
    private boolean isKing;

    public BankAccount(String name, double balance, String animalType, Boolean isKing) {
        this.id = nextId++;
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;

    }

    public boolean isKing() {
        return isKing;
    }

    public int getId() {
        return id;
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
