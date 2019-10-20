package com.ddd.sample;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import java.util.Set;

public interface Validable {

    default <T> void validate() {
        validate(this);
    }
    default <T> void validate(T object) {
        Set<ConstraintViolation<T>> actualViolations = Validation.buildDefaultValidatorFactory().getValidator().validate(object);
        if(!actualViolations.isEmpty())
            throw new IllegalArgumentException(actualViolations.toString());
    }
}
