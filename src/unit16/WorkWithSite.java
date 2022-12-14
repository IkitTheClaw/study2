package unit16;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class WorkWithSite {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        URL url = new URL(line);
        try (InputStream input = url.openStream()) {

            byte[] buffer = input.readAllBytes();
            String str = new String(buffer);
            Path filetemp = Files.createTempFile(null,null);
            Files.write(filetemp,buffer);
        }
    }
}
