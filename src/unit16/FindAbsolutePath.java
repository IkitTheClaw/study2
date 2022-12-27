package unit16;

import java.nio.file.Path;
import java.util.Scanner;

public class FindAbsolutePath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean absolute = Path.of(str).isAbsolute();
        if (absolute){
            System.out.println(str);
        }else {
            Path path = Path.of(str).toAbsolutePath();
            System.out.println(path);
        }
    }
}


