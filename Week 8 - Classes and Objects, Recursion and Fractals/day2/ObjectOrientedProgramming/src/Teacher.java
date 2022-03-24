public class Teacher {

    public static String giveAnswer(){
        return "the teacher is answering a question";
    }

    public String teach(Student student){
        return Student.learn();
    }
}
