package unit17.Convert;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class ConvertMapIntoSet {
    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
       Set<LocalDateTime> dateTimes = new HashSet<>();
        for(LocalDate date : sourceMap.keySet()){
           for(LocalTime time :sourceMap.get(date)){
               dateTimes.add(LocalDateTime.of(date,time));
           }
       }
        return dateTimes;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}
