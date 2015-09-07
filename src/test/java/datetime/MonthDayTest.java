package datetime;

import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

import org.junit.Test;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 */
public class MonthDayTest {


    @Test
    public void testLeapYear() throws Exception {
        MonthDay date = MonthDay.of(Month.FEBRUARY, 29);
        System.out.println("Has Feb 29 in 2011? " + date.isValidYear(2011));
        System.out.println("Has Feb 29 in 2012? " + date.isValidYear(2012));

        System.out.println("Leap Year 2012? " + Year.of(2012).isLeap());
    }
}
