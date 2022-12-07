package Unit5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        String[] ar = new String[array.length];
        int counter = array.length;
        for (int i = 0; i < array.length; i++){
            if (array[i] != null) {
                ar[array.length - counter] = array[i];
                counter--;
            }
        }
        for (int i = 0; i < ar.length; i++){
            array[i] = ar[i];
        }
    }
}