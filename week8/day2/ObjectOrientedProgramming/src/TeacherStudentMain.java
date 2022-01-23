public class TeacherStudentMain {

    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student s = new Student();

        System.out.println(s.question(t));
        System.out.println(t.teach(s));
    }
}
