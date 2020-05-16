package spring.love2code.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = LinkConstraintValidation.class)
public @interface Link {

    String[] value() default {"http"};

    String message() default "Must be in link format";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
