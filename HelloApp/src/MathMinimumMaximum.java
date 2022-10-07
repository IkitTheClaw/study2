
import java.util.Arrays;
import java.util.Scanner;

public class MathMinimumMaximum {
    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        Arrays.sort(ints);
        return Math.min(ints[0],ints[1]);
    }

    public static int[] getArrayOfTenElements() {
        Scanner sc = new Scanner(System.in);
        int[] trap = new int [10];
        for(int i =0;i < trap.length;i++){
            trap[i] = sc.nextInt();
        }
        return trap;
    }
}

