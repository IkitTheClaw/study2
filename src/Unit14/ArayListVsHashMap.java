package Unit14;

import java.util.ArrayList;
import java.util.HashMap;

public class ArayListVsHashMap {
    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer,String> getProgrammingLanguages() {
        HashMap<Integer,String> sol = new HashMap<>();
        ArrayList<String> programmingLanguages = new ArrayList<>();
        sol.put(0,"Java");
        sol.put(1,"Kotlin");
        sol.put(2,"Go");
        sol.put(3,"Javascript");
        sol.put(4,"Typescript");
        sol.put(5,"Python");
        sol.put(6,"PHP");
        sol.put(7,"C++");
        return sol;
    }

}

