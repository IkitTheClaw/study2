package unit16;

import java.nio.file.Path;
import java.util.Scanner;


public class FindPathFile2 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        Path path1 = Path.of(str1);
        Path path2 = Path.of(str2);
        try{
            Path result = path1.relativize(path2);
            System.out.println(result);
        }catch (Exception ignored){
        }
    }
}

