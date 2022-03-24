package com.greenfoxacademy.music;

public class ElectricGuitar extends StringedInstrument{

    public ElectricGuitar() {
        super.name = "Electric Guitar";
        super.numberOfStrings = 6;
    }

    public ElectricGuitar(int numberOfStrings ) {
        super.name = "Electric Guitar";
        super.numberOfStrings = numberOfStrings;
    }

    @Override
    public String sound() {
        return "Twang";
    }

}
