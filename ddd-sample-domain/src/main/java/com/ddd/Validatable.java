package com.ddd;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public interface Validatable<T> {
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    Validator validator = factory.getValidator();

    default void validate(T object) {
        Set<ConstraintViolation<T>> actualViolations = validator.validate(object);
        if(!actualViolations.isEmpty()) {
            throw new DomainConstraintValidationException(actualViolations.toString());
        }
    }
}
