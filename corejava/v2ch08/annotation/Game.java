package v2ch08.annotation;

import java.lang.annotation.*;

@Repeatable(People.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Game {
    String value() default "";
}
