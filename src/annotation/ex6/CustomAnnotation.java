package annotation.ex6;

import java.lang.annotation.*;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.METHOD)
@Documented
@Inherited
public @interface CustomAnnotation {
    String value() default "Default String Value";
}
