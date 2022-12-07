package Unit14;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Rewrite2 {
    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void sort(ArrayList<Integer> list) {
      Collections.sort(list);
    }

    public static void rotate(ArrayList<Integer> list, int distance) {
       Collections.rotate(list,distance);
    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }
}
