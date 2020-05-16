package spring.love2code.validation;

import org.hibernate.validator.ap.ConstraintValidationProcessor;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Array;
import java.util.Arrays;

public class LinkConstraintValidation implements ConstraintValidator<Link, String> {

    private String[] link;

    @Override
    public void initialize(Link constraintAnnotation) {
        link = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s == null || link.length == 0) return true;
        if (s.startsWith(link[0])) return Arrays.stream(link).allMatch(s::contains);
        return false;
    }
}
