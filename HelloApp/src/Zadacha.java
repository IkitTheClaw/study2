import java.util.Scanner;

public class Zadacha {
    public static String[] strings;

    public static void main(String[] args) {
        strings = new String[6];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i< strings.length;i++){
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            String current = strings[i];
            for (int j = 0; j < strings.length; j++) {
                if (i != j && current != null && current.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }
        System.out.println(strings.length);
        for (String str : strings)
            System.out.println(str);
    }
}
