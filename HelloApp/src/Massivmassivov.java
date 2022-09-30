import java.util.Scanner;

public class Massivmassivov {
    public static int[][] multiArray;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        multiArray = new int[n][];
        for(int i = 0;i < multiArray.length;i++){
            int j = sc.nextInt();
            multiArray[i] = new int[j];
        }
        for(int i = 0;i < multiArray.length;i++){
            for(int f = 0;f < multiArray[i].length;f++){
                System.out.print(multiArray[i]);
            }
            System.out.println();
        }
    }
}
