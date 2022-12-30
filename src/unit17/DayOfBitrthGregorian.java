package unit17;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DayOfBitrthGregorian {
    static Calendar birthDate = new GregorianCalendar(1999,Calendar.MARCH,27);


    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {

        return calendar.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, new Locale("ru","RU"));
    }
}
