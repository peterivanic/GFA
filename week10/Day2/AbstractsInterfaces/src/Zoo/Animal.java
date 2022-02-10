package Zoo;

public abstract class Animal {
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
}
