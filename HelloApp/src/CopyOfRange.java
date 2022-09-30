import java.util.Arrays;

public class CopyOfRange {
    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    public static void main(String[] args) {
        int half = array.length % 2 == 0 ? array.length / 2 : array.length /2 + 1;
        int [] first = Arrays.copyOfRange(array,0,half);
        int [] second = Arrays.copyOfRange(array,half,array.length);
        for(int i  = 0;i < result.length;i++){
            result[0] = Arrays.copyOf(first,half);
            result[1] = Arrays.copyOf(second,second.length);
        }
        System.out.println(Arrays.deepToString(result));

    }
}