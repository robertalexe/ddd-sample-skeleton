package com.ddd.presentation;

import com.ddd.DomainConstraintValidationException;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DomainEntityTest {

    @Test
    public void should_create_domain_entity_with_description_and_short_label() {
        Description description = aValidDescription();
        ShortLabel title = aValidShortLabel();
        UniqueId id = new UniqueId();
        DomainEntity domainEntity = new DomainEntity(id, title, description);
        assertThat(domainEntity).isNotNull();
        assertThat(domainEntity.getId()).isEqualTo(id);
        assertThat(domainEntity.getDescription()).isEqualTo(description);
        assertThat(domainEntity.getTitle()).isEqualTo(title);
    }

    @Test
    public void should_return__equally_true_for_2_domain_entities_with_same_id() {
        UniqueId id = new UniqueId();
        DomainEntity first = new DomainEntity(id, aValidShortLabel(), aValidDescription());
        DomainEntity second = new DomainEntity(id, anOtherValidShortLabel(), anOtherValidDescription());
        assertThat(first).isEqualTo(second);
    }

    @Test(expected = DomainConstraintValidationException.class)
    public void should_reject_creation_of_domain_entity_with_null_description() {
        new DomainEntity(new UniqueId(), aValidShortLabel(), null);
    }

    @Test(expected = DomainConstraintValidationException.class)
    public void should_reject_creation_of_domain_entity_with_null_title() {
        new DomainEntity(new UniqueId(), null, aValidDescription());
    }

    private Description aValidDescription() {
        return new Description("description text");
    }

    private Description anOtherValidDescription() {
        return new Description("description text new");
    }

    private ShortLabel aValidShortLabel() {
        return new ShortLabel("short label text");
    }

    private ShortLabel anOtherValidShortLabel() {
        return new ShortLabel("short label text new");
    }

}