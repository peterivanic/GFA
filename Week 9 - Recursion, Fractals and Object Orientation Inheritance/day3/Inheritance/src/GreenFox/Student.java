package GreenFox;

public class Student extends Person {

    String previousOrganization;
    int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;

    }

    public Student() {
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender +" from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays( int numberOfDays){
        this.skippedDays = skippedDays + numberOfDays;
    }
}
