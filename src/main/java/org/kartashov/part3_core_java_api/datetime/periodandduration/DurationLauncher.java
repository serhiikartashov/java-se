package org.kartashov.part3_core_java_api.datetime.periodandduration;

import java.time.*;

public class DurationLauncher {

    public static void main(String[] args) {
        Instant t1 = Instant.now();
        Instant t2 = Instant.now().plusSeconds(12);
        long nanos = Duration.between(t1, t2).toNanos();
        System.out.println(nanos);                // 12000000000
        long milis = Duration.between(t2, t1).toMillis();
        System.out.println(milis);                // -12000

        Duration gap = Duration.ofSeconds(13);
        Instant later = t1.plus(gap);
        System.out.println(t1);                // 2015-10-13T08:58:41.312Z
        System.out.println(later);                // 2015-10-13T08:58:54.312Z
        System.out.println(gap);

        Period p = Period.between(LocalDate.now(), LocalDate.of(2015, Month.SEPTEMBER, 1));
        System.out.println(p);
        Duration d = Duration.between(LocalDateTime.now(), LocalDateTime.of(2015, Month.SEPTEMBER, 2, 10, 10));
        System.out.println(d);

    }

}
