package Unit14;
import java.util.Collections;
import java.util.HashSet;


public class Hash {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        HashSet<String> set = new HashSet<String>();
        for(String str : strings){
            set.add(str);
        }
        return set;
    }
}

