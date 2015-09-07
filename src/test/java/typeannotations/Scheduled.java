package typeannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 */
@Target(ElementType.METHOD)
@Repeatable(Schedulers.class)
public @interface Scheduled {

    String value();
}
