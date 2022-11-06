package me.kamesh.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = PdfFileValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RUNTIME)
public @interface PdfFileConstraint {
    String message() default "File should be a PDF, should not be empty and should not be greater than 1MB";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
