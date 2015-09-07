package datetime;

import java.time.Clock;
import java.time.ZoneId;

import org.junit.Test;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 */
public class ClockTest {


    @Test
    public void testClockAPI() throws Exception {
        Clock clockUTC = Clock.systemUTC();
        Clock clockDefault = Clock.systemDefaultZone();
        ZoneId zoneBerlin = ZoneId.of("Africa/Nairobi");
        Clock localClock = Clock.system(zoneBerlin);

        System.out.println("UTC:            " + clockUTC.millis());
        System.out.println("Default:        " + clockDefault.millis());
        System.out.println("Africa/Nairobi: " + localClock.millis());
    }
}
