package com.ddd.presentation;

import com.ddd.BaseValueObject;
import com.ddd.DDD;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.UUID;

import static java.util.Collections.singletonList;
import static java.util.Objects.requireNonNull;

@DDD.ValueObjectId
public class UniqueId extends BaseValueObject<UniqueId> {

    @NotEmpty @Size(max = 36)
    private final String value;

    public UniqueId() {
        super(UniqueId.class);
        this.value = UUID.randomUUID().toString();
        validate(this);
    }

    public UniqueId(UniqueId other) {
        super(UniqueId.class);
        this.value = requireNonNull(other).getValue();
        validate(this);
    }

    public String getValue() {
        return value;
    }

    @Override
    protected List<Object> attributesToIncludeInEqualityCheck() {
        return singletonList(value);
    }
}
