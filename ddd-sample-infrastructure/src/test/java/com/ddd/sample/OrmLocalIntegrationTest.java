package com.ddd.sample;


import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PersistenceConfig.class)
@EnableAutoConfiguration
@SpringBootTest
public class OrmLocalIntegrationTest {

    @PersistenceContext
    private EntityManager em;

    @Test
    public void loading_the_mapping_should_not_crash() {
        Assertions.assertThat(em).isNotNull();
    }
}
