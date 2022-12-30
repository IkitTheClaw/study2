package unit17;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class UseFormat2 {
    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter form = DateTimeFormatter.ofPattern("e d.M.yy.HH:mm:ss.n VV");
        System.out.println(form.format(zonedDateTime));
    }
}
