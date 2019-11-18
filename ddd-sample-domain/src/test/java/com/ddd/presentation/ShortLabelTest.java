package com.ddd.presentation;

import com.ddd.DomainConstraintValidationException;
import org.junit.Test;

import static com.ddd.presentation.TestUtils.generateStringOfLength;
import static org.assertj.core.api.Assertions.assertThat;

public class ShortLabelTest {

    @Test
    public void should_create_short_label_with_50_chars() {
        ShortLabel shortLabel = new ShortLabel(generateStringOfLength(50));
        assertThat(shortLabel).isNotNull();
        assertThat(shortLabel.getValue()).hasSize(50);
    }

    @Test(expected = DomainConstraintValidationException.class)
    public void should_reject_short_label_with_empty_content() {
        new ShortLabel("");
    }

    @Test(expected = DomainConstraintValidationException.class)
    public void should_reject_short_label_with_101_chars() {
        new ShortLabel(generateStringOfLength(101));
    }

}