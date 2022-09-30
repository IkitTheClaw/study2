import java.util.Arrays;

public class useMethodTask5 {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int[] adarray = Arrays.copyOf(array, array.length);
        int i = 0;
        int j = adarray.length - 1;
        for (; i < adarray.length; i++,j--) {
            array[i] = adarray[j];        //напишите тут ваш ко
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}

