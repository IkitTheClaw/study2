package unit16;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class StreamReverse {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        printSomething(reverseString(scanner.nextLine()));
        String result = outputStream.toString();
        System.out.println(result);
    }
    public static void printSomething(String str) {
        stream.print(str);
    }
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
