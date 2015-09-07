package functional;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.junit.Test;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 */
public class SimpleTest {


    @Test
    public void testRun() throws Exception {
        run(new Runnable() {
            public void run() {
                System.out.println("Hello, World.");
            }
        });
    }

    public static void run(Runnable runnable) {
        runnable.run();
    }

    @Test
    public void testCalculate() throws Exception {
        calculate(new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        });
    }

    public static void calculate(BiFunction<Integer, Integer, Integer> function) {
        System.out.println("Result: " + function.apply(1, 2));
    }

    @Test
    public void testSupply() throws Exception {
        supply(new Supplier<String>() {
            @Override
            public String get() {
                return "Hello, World.";
            }
        });
    }

    public static void supply(Supplier<String> supplier) {
        System.out.println("Result: " + supplier.get());
    }

    @Test
    public void testConsume() throws Exception {

        consume(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Consume: " + s);
            }
        });
    }

    public static void consume(Consumer<String> consumer) {
        consumer.accept("Hello, World.");
    }
}
