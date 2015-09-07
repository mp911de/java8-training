package datetime;

import java.time.LocalDateTime;

import org.junit.Test;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 */
public class TypeTest {


    @Test
    public void test() throws Exception {

        LocalDateTime localDateTime = LocalDateTime.of(2015, 8, 9, 9, 00);
        System.out.println("Date and Time: " + localDateTime);

        System.out.println("Time only: " + localDateTime.toLocalTime());
        System.out.println("Date only: " + localDateTime.toLocalDate());
    }
}
