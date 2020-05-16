package spring.love2code.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String courseCode;

    @Override
    public void initialize(CourseCode constraintAnnotation) {
        courseCode = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s == null || s.startsWith(courseCode);
    }
}
