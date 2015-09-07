package interfaces;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 */
public interface MyJava8Interface {

    void doSomething();

    default void doSomethingElse() {
        System.out.println("doSomethingElse");
    }

    static void somethingStatic() {
        System.out.println("somethingStatic");
    }
}
