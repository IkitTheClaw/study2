package unit17;

import java.time.Instant;

public class EndOfTimes {
    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        return Instant.ofEpochMilli(Long.MAX_VALUE);
    }

    static Instant getMaxFromSeconds() {
        Long i = Instant.MAX.getEpochSecond();
        return Instant.ofEpochSecond(i);
    }

    static Instant getMaxFromSecondsAndNanos() {
        Long i = Instant.MAX.getEpochSecond();
        Long j = 999_999_999L;
        return Instant.ofEpochSecond(i,j);
    }
}
