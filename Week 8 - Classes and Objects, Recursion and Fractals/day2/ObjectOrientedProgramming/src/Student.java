public class Student {

    public static String learn(){
        return "the student is actually learning";
    }

    public String question(Teacher teacher){
       return Teacher.giveAnswer();
    }
}
