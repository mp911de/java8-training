package datetime;

import java.time.ZonedDateTime;

import org.junit.Test;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 */
public class FluentAPITest {

    @Test
    public void fluentApi() throws Exception {

        ZonedDateTime now = ZonedDateTime.now();
        int dayOfYear = now.plusHours(12).minusDays(7).withSecond(0).withNano(0).getDayOfYear();
        System.out.println("Day of Year: " + dayOfYear);
    }
}
