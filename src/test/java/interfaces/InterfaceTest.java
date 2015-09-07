package interfaces;

import org.junit.Test;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 */
public class InterfaceTest implements MyJava8Interface {

    @Test
    public void test() throws Exception {

        this.doSomething();
        this.doSomethingElse();

        MyJava8Interface.somethingStatic();
    }

    @Override
    public void doSomething() {
        System.out.println("I implement doSomething");
    }
}
