package com.ddd.presentation;

import com.ddd.BaseValueObject;
import com.ddd.DDD;

import javax.validation.constraints.Size;
import java.util.List;

import static java.util.Collections.singletonList;

@DDD.ValueObject
public class Description extends BaseValueObject<Description> {

    @Size(max = 5000)
    private final String value;

    public Description(String value) {
        super(Description.class);
        this.value = value;
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
