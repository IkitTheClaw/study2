package Unit14.NextMonth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static List<Month> asList(){
        ArrayList<Month> list = new ArrayList<>();
        Collections.addAll(list,values());
        return list;
    }
    public static Month[] getWinterMonths(){
        ArrayList <Month> list = new ArrayList<>();
        Collections.addAll(list, values());
        Collections.rotate(list, 1);
        Month [] array = list.toArray(new Month[list.size()]);
        Month [] copiedArray = Arrays.copyOfRange(array, 0, 3);
        return copiedArray;
    }
    public static Month[] getSpringMonths(){
        ArrayList <Month> list = new ArrayList<>();
        Collections.addAll(list, values());
        Collections.rotate(list, 1);
        Month [] array = Month.values();
        Month [] copiedArray = new Month[3];
        copiedArray = Arrays.copyOfRange(array, 2, 5);
        return copiedArray;
    }
    public static Month[] getSummerMonths(){
        ArrayList <Month> list = new ArrayList<>();
        Collections.addAll(list, values());
        Collections.rotate(list, 1);
        Month [] array = Month.values();
        Month [] copiedArray = new Month[3];
        copiedArray = Arrays.copyOfRange(array, 5, 8);
        return copiedArray;
    }
    public static Month[] getAutumnMonths(){
        ArrayList <Month> list = new ArrayList<>();
        Collections.addAll(list, values());
        Collections.rotate(list, 1);
        Month [] array = Month.values();
        Month [] copiedArray = new Month[3];
        copiedArray = Arrays.copyOfRange(array, 8, 11);
        return copiedArray;
    }
}
