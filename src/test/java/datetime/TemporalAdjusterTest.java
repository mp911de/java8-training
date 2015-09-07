package datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;

import org.junit.Test;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 */
public class TemporalAdjusterTest {


    @Test
    public void testAdjuster() throws Exception {

        ZonedDateTime now = ZonedDateTime.now();

        System.out.println("firstDayOfNextMonth: " + now.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println("lastDayOfMonth: " + now.with(TemporalAdjusters.lastDayOfMonth()));
    }

    @Test
    public void calculatePayday() throws Exception {

        LocalDate today = LocalDate.now();
        LocalDate later = today.with(TemporalAdjusters.lastDayOfMonth()).minusDays(2);
        System.out.println(later);
    }

    @Test
    public void addPeriod() throws Exception {

        LocalDate today = LocalDate.now();
        LocalDate fiveDaysLater = today.plus(Period.parse("P5D"));
        System.out.println(fiveDaysLater);
    }
}
