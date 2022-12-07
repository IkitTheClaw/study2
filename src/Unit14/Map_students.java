package Unit14;

import java.util.HashMap;

public class Map_students {
        public static HashMap<String, Double> grades = new HashMap<>();

        public static void main(String[] args) {
            addStudents();
            System.out.println(grades);
        }

        public static void addStudents() {
            grades.put("StudentOne",1.3);
            grades.put("StudentTwo",2.4);
            grades.put("StudentThree",3.5);
            grades.put("StudentFour",4.5);
            grades.put("StudentFive",5.0);
        }
    }

