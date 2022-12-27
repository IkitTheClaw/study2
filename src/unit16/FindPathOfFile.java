package unit16;

import java.nio.file.Path;
import java.util.Scanner;


public class FindPathOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path path = Path.of(str).getRoot();
        System.out.println(path);
    }
}


