package Zoo;

import Flyable.Flyable;

public abstract class Animal implements Flyable {
    String name;
    int age;
    String gender;
    String color;
    int countOfLegs;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String breed(){
        return null;
    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void takeOff() {

    }
}
