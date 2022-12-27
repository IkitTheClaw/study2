package unit16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class SkipSomeLines {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<String> filein = Files.readAllLines(Path.of(scanner.nextLine()));
        int row = 0;
        for (String line : filein) {
            if (row % 2 != 0) {
                System.out.println(line);
                row ++;
            }
        }
    }
}