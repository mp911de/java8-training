package functional;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 */
public class SortTest {

    @Test
    public void sort() throws Exception {

        List<String> strings = new ArrayList<>(Arrays.asList("c", "a", "b"));

        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        System.out.println(strings);

        assertThat(strings).containsExactly("a", "b", "c");
    }
}
