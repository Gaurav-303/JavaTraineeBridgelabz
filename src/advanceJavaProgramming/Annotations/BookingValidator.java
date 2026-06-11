package advanceJavaProgramming.Annotations;

import java.lang.reflect.Field;

public class BookingValidator {

    public static void validate(Object obj) throws Exception {

        for (Field field : obj.getClass().getDeclaredFields()) {

            if (field.isAnnotationPresent(BookingValidation.class)) {

                field.setAccessible(true);

                BookingValidation annotation =
                        field.getAnnotation(BookingValidation.class);

                Object value = field.get(obj);

                if (annotation.required() &&
                        (value == null || value.toString().isEmpty())) {

                    System.out.println(annotation.message());
                }
            }
        }
    }
}
