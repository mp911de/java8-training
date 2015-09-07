package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 */
public class CapturingTest {

    @Test
    public void capturing() throws Exception {

        List<String> strings = new ArrayList<>(Arrays.asList("c", "a", "b"));
        int counter = 0;
        String prefix = "pfx";

        Collections.sort(strings, (o1, o2) -> {
            System.out.println(counter);
            return o1.compareToIgnoreCase(prefix + o2);
        });
    }
}
