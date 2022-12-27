package unit16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;


public class WorkWithSite2 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        try (InputStream input = url.openStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        }
    }
}
