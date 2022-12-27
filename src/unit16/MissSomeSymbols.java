package unit16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MissSomeSymbols {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            List <String> list = Files.readAllLines(Paths.get(scanner.next()));
            list.stream().map(s -> s.replaceAll("[,. ]", "")).toList().forEach(System.out::println);
    } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
