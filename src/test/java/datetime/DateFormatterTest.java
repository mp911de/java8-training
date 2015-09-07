package datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 */
public class DateFormatterTest {

    @Test
    public void testFormatter() throws Exception {

        LocalDate xMasDate = LocalDate.of(2013, Month.DECEMBER, 24);
        LocalTime evening = LocalTime.of(20, 0);
        LocalDateTime xMas = LocalDateTime.of(xMasDate, evening);

        String pattern = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);

        System.out.println(dtf.format(xMas));
    }
}
