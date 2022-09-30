import java.util.Arrays;

public class Vivod {
    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int a = array.length;
        int b = a/2;
        int c = (a/2) + 1;

        if (a%2 == 0) {
            // Массив чётной длины
            Arrays.fill(array, 0, b, valueStart);
            Arrays.fill(array, b, a, valueEnd);
        }
        else {
            // Массив нечётной длины
            Arrays.fill(array, 0, c, valueStart);
            Arrays.fill(array, c, a, valueEnd);
        }
    }
}