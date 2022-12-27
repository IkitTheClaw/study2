package unit16;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WorkWithStream {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            int size = 1024;
            byte[] buffer = new byte[size];
            while (inputStream.available() > 0) {
                int read = inputStream.read(buffer);
                outputStream.write(buffer, 0, read);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }


    public static void swap(byte[] array, int count) {
        for (int i = 0; i < array.length; i += 2) {
            if (i == count - 1 || (array[count - 1] % 2 != 0 && i == count - 1)) {
                return;
            }
            byte temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
    }
}
