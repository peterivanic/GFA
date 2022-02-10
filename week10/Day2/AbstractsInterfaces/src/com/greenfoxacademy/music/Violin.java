package com.greenfoxacademy.music;

public class Violin extends StringedInstrument {

    public Violin() {
        super.name = "Violin";
        super.numberOfStrings = 4;
    }

    public Violin(int numberOfStrings) {
        super.name = "Violin";
        super.numberOfStrings = numberOfStrings;
    }

    @Override
    public String sound() {
        return "Screech";
    }


}
