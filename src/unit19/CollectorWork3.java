package unit19;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class CollectorWork3 {
    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getMap(stringStream).forEach((s, i) -> System.out.println(s + " - " + i));
    }

    public static Map<String, Integer> getMap(Stream<String> stringStream) {
        return stringStream.collect(toMap(str->str, String::length));
    }
}

