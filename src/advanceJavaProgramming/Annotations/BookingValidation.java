package advanceJavaProgramming.Annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface BookingValidation {

    boolean required() default true;

    String message() default "Field is required";
}