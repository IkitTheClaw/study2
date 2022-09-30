import java.util.Arrays;

public class BinarySearch {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;
    public static void main(String[] args) {
        int[] first = Arrays.copyOf(array,array.length);
        Arrays.sort(first);
        int index = Arrays.binarySearch(first,element);
        System.out.println(index >= 0);
    }
}
