package starwars;

public class Person {

//    name;height;mass;hair_color;skin_color;eye_color;birth_year;gender

    private String name;
    private long height;
    private double mas;
    private String hairColor;
    private String eyeColor;
    private String birthYear;
    private String gender;


    public Person(String name, long height, double mas, String hairColor, String eyeColor, String birthYear, String gender) {
        this.name = name;
        this.height = height;
        this.mas = mas;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.birthYear = birthYear;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", mas=" + mas +
                ", hairColor='" + hairColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", birthYear='" + birthYear + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public long getHeight() {
        return height;
    }

    public double getMas() {
        return mas;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public String getGender() {
        return gender;
    }

}
