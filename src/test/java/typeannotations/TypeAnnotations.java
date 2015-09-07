package typeannotations;

import java.io.Serializable;


/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 */
public class TypeAnnotations implements @RocketShip Serializable {


    public String getValue() throws Exception {
        @NotNull String myString = "";

        return (@NotNull String) myString;
    }

    void launchRocket() throws @Critical IllegalStateException {
    }
}
