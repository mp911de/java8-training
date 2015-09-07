package typeannotations;

import org.junit.Test;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 */
public class Repeating {

    @Scheduled("Mondays")
    @Scheduled("Tuesdays")
    public void timer() {

    }
}
