package functional;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 */
public class MethodReferenceTest {

    @Test
    public void methodReferences() throws Exception {

        List<String> words = Arrays.asList("Fizz", "Buzz");

        words.forEach((word) -> {
            System.out.println(word);
        });
    }
}
