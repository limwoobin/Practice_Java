package ch10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

import static java.time.temporal.TemporalAdjusters.*;

class DayAfterTomorrow implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(2 , ChronoUnit.DAYS);
    }
}

public class NewTimeEx3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date = today.with(new DayAfterTomorrow());

        p(today);
        p(date);

        p(today.with(firstDayOfNextMonth()));
        p(today.with(firstDayOfMonth()));
        p(today.with(lastDayOfMonth()));
        p(today.with(firstInMonth(DayOfWeek.TUESDAY)));
        p(today.with(lastInMonth(DayOfWeek.TUESDAY)));
        p(today.with(previous(DayOfWeek.TUESDAY)));
        p(today.with(previousOrSame(DayOfWeek.TUESDAY)));
        p(today.with(next(DayOfWeek.TUESDAY)));
        p(today.with(nextOrSame(DayOfWeek.TUESDAY)));
        p(today.with(dayOfWeekInMonth(4, DayOfWeek.TUESDAY)));
    }

    public static void p(Object obj) {
        System.out.println(obj);
    }
}
