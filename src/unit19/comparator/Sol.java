package unit19.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sol {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Comparator<Student> studentComparator = Comparator.comparingInt(Student::getAge);
        Collections.addAll(students,
                new Student("Иванов", 22),
                new Student("Петров", 18),
                new Student("Сидоров", 19)
        );

        students.sort(studentComparator);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
