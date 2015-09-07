package datetime;

import java.time.LocalDateTime;
import java.time.Period;

import org.junit.Test;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 */
public class PeriodTest {

    @Test
    public void testPeriod() throws Exception {

        Period period = Period.parse("P1Y2M3W4D");

        LocalDateTime localDateTime = LocalDateTime.of(2015, 8, 9, 9, 00);
        LocalDateTime later = localDateTime.plus(period);

        System.out.println("Original: " + localDateTime);
        System.out.println("Later:    " + later);
    }
}
