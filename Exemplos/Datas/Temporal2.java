package br.acc.datas;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class Temporal2 {

    public static void main(String[] args) {
//        System.out.println(convert(ChronoUnit.DAYS));
        Instant t1 = Instant.now();
        long hours = 2;
        long minutes = 30;
        Instant t2 = t1.plus(hours, ChronoUnit.HOURS).plus(minutes, ChronoUnit.MINUTES);

        Duration gap = Duration.ofSeconds(13);
        Instant later = t1.plus(gap);
        System.out.println(later);//  www  .  ja va 2 s . co m

        System.out.println(ChronoUnit.SECONDS.between(t1, t2));
    }

    public static TimeUnit convert(ChronoUnit tu) {
        if (tu == null) {
            return null;
        }
        switch (tu) {
        case DAYS:
            return TimeUnit.DAYS;
        case HOURS:
            return TimeUnit.HOURS;
        case MINUTES:
            return TimeUnit.MINUTES;
        case SECONDS:
            return TimeUnit.SECONDS;
        case MICROS:
            return TimeUnit.MICROSECONDS;
        case MILLIS:
            return TimeUnit.MILLISECONDS;
        case NANOS:
            return TimeUnit.NANOSECONDS;
        default:
            //TODO support the rest
            throw new UnsupportedOperationException("Man, use a real temporal unit");
        }
    }

    public static ChronoUnit convert(TimeUnit tu) {
        if (tu == null) {
            return null;
        }
        switch (tu) {
        case DAYS:
            return ChronoUnit.DAYS;
        case HOURS:
            return ChronoUnit.HOURS;
        case MINUTES:
            return ChronoUnit.MINUTES;
        case SECONDS:
            return ChronoUnit.SECONDS;
        case MICROSECONDS:
            return ChronoUnit.MICROS;
        case MILLISECONDS:
            return ChronoUnit.MILLIS;
        case NANOSECONDS:
            return ChronoUnit.NANOS;
        default:
            assert false : "there are no other TimeUnit ordinal values";
            return null;
        }
    }
}
