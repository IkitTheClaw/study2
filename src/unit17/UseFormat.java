package unit17;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UseFormat {
    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyyy-Hч-mмин");
        String result = form.format(localDateTime);
        System.out.println(result);
    }
}
