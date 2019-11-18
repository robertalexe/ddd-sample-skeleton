package com.ddd;

import java.util.List;

import static java.lang.String.format;
import static java.util.Objects.hash;
import static java.util.Objects.requireNonNull;

public abstract class BaseValueObject<T extends BaseValueObject<T>> implements Validable<T> {
    private final Class<T> type;

    public BaseValueObject(Class<T> type) {
        this.type = requireNonNull(type);
    }

    protected abstract List<Object> attributesToIncludeInEqualityCheck();

    @Override
    public boolean equals(Object obj) {
        if (!type.isInstance(obj))
            return false;
        T other = type.cast(obj);
        return this.attributesToIncludeInEqualityCheck()
                .equals(other.attributesToIncludeInEqualityCheck());
    }

    @Override
    public int hashCode() {
        return hash(attributesToIncludeInEqualityCheck());
    }

    @Override
    public String toString() {
        return format("[name - value] : [%s : %s]", type.getSimpleName(), attributesToIncludeInEqualityCheck());
    }
}
