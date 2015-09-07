package datetime;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 */
public class LegacyAPITest {

    @Test
    public void testCalendarAndDate() throws Exception {

        Instant instant = Calendar.getInstance().toInstant();

        GregorianCalendar.from(ZonedDateTime.now());
    }
}
