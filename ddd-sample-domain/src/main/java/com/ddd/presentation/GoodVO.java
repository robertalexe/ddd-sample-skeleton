package com.ddd.presentation;

import com.ddd.DDD;
import com.ddd.Validatable;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@DDD.ValueObject
public class GoodVO implements Validatable<GoodVO> {

    @NotEmpty private final List<String> someValues;

    public GoodVO(@NotEmpty List<String> someValues) {
        this.someValues = new ArrayList<>(someValues);
        validate(this);
    }

    public List<String> getSomeValues() {
        return Collections.unmodifiableList(someValues);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodVO goodVO = (GoodVO) o;
        return someValues.equals(goodVO.someValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(someValues);
    }
}
