package unit16;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FilesOrDirectory {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path path;
        while (true) {
            path = Path.of(scanner.nextLine());
            if (Files.isRegularFile(path)) {
                System.out.println(path + THIS_IS_FILE);
            } else if (Files.isDirectory(path)) {
                System.out.println(path + THIS_IS_DIR);
            } else {
                break;
            }
        }
    }
}
