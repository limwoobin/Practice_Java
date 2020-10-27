package annotation.ex2;

import java.lang.annotation.*;

@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({
        ElementType.METHOD
})
public @interface DrAnnotation {
    String value() default "DrAnnotation : Default String Value";
}
