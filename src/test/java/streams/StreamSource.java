package streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 */
public class StreamSource {

    @Test
    public void random() throws Exception {

        Random random = new Random();
        Stream<Integer> randomNumbers =
                Stream.generate(random::nextInt);

        randomNumbers.limit(10).forEach(integer -> System.out.println(integer));
    }

    @Test
    public void concat() throws Exception {

        Random random = new Random();
        Stream<Integer> randomNumbers =
                Stream.generate(random::nextInt);

        Stream<Integer> always1 =
                Stream.generate(() -> 1);

        Stream.concat(always1.limit(5), randomNumbers.limit(10)).forEach(integer -> System.out.println(integer));
    }

    @Test
    public void intStream() throws Exception {
        IntStream.iterate(1, i -> i + 1).skip(5).limit(5).forEach(value -> System.out.println(value));
    }
}
