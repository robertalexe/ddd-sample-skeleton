package com.ddd.presentation;

import com.ddd.DomainConstraintValidationException;
import org.junit.Test;

import static com.ddd.presentation.TestUtils.generateStringOfLength;
import static org.assertj.core.api.Assertions.assertThat;

public class DescriptionTest {

    @Test
    public void should_create_description_vo_with_100_chars() {
        Description description = new Description(generateStringOfLength(100));
        assertThat(description).isNotNull();
        assertThat(description.getValue()).hasSize(100);
    }

    @Test
    public void should_create_null_description() {
        Description description = new Description(null);
        assertThat(description).isNotNull();
    }

    @Test
    public void should_create_description_of_5000_chars() {
        Description description = new Description(generateStringOfLength(5000));
        assertThat(description).isNotNull();
        assertThat(description.getValue()).hasSize(5000);
    }

    @Test(expected = DomainConstraintValidationException.class)
    public void should_reject_description_over_5000_chars() {
        new Description(generateStringOfLength(5001));
    }
}