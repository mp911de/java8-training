package datetime;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 */
public class DurationTest {

    @Test
    public void testDuration() throws Exception {

        Instant start = Instant.now();
        TimeUnit.SECONDS.sleep(5);

        Instant end = Instant.now();
        Duration elapsed = Duration.between(start, end);

        System.out.println(elapsed);  // Output: PT5.008S
    }
}
