package unit13.test;
import java.util.ArrayList;
import java.util.Collection;


public class Faculty {

    public static void main(String[] args) {
       ArrayList<Student> students = new ArrayList<>();
       Testus<Student> testus = new Testus<>();
       testus.foo(new Student("lexa"));
        Collection<Student> col =  testus.foo(new Student("lexa"));
        students.add(new Student("Акакий"));
        students.add(new Student("Любослав"));

        printStudentNames( students);
    }

    public static void printStudentNames(ArrayList <Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
    }
}