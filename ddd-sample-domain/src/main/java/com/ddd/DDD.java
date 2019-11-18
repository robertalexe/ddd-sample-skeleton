package com.ddd;

public @interface DDD {
    @interface DomainEntity{}

    @interface ValueObject{}

    @interface ValueObjectId{}

    @interface Aggregate {}

    @interface AggregateRoot {}

    @interface DomainService {}

    @interface DomainEvent {}

    @interface InfrastructureService {}

    @interface InfrastructureServiceImpl {}

    @interface Repository {}

    @interface RepositoryImpl {}

    @interface ApplicationService {}
}
