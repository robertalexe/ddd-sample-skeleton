package com.ddd.sample;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = {"com.ddd.sample"}
)
@EntityScan(
        basePackages = {"com.ddd.sample"}
)
@ComponentScan(
        basePackages = {"com.ddd.sample"}
)
public class PersistenceConfig {
    public PersistenceConfig() {}
}
