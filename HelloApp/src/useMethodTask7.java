import java.util.Scanner;

public class useMethodTask7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long result = cube(a);
        System.out.println(result);
    }
    public static long cube(long a){
        return (a*a*a);
    }
}
