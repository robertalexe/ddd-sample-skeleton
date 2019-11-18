package com.ddd.presentation;

import com.ddd.BaseEntity;
import com.ddd.DDD;

import javax.validation.constraints.NotNull;

@DDD.DomainEntity
public class DomainEntity extends BaseEntity<DomainEntity, UniqueId> {

    @NotNull private ShortLabel title;
    @NotNull private Description description;

    public DomainEntity(UniqueId id, ShortLabel title, Description description) {
        super(DomainEntity.class, id);
        this.title = title;
        this.description = description;
        validate(this);
    }

    public ShortLabel getTitle() {
        return title;
    }

    public Description getDescription() {
        return description;
    }
}
