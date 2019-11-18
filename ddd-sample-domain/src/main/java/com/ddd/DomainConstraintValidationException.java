package com.ddd;

/**
 * The DomainConstraintValidationException wraps all exceptions caused by rules violation in the
 * creation of an domain object such as Entity, Value Object or Aggregate
 */
public class DomainConstraintValidationException extends RuntimeException {

    public DomainConstraintValidationException(String message) {
        super(message);
    }
}
