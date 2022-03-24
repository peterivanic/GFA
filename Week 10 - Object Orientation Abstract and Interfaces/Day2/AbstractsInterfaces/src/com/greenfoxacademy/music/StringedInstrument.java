package com.greenfoxacademy.music;

public abstract class StringedInstrument extends Instrument {

    protected int numberOfStrings = 0;

    public String sound(){
        return null;
    }

    @Override
    public void play(){
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());

    }
}
