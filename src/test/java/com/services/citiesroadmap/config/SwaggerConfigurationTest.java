package com.services.citiesroadmap.config;

import org.junit.Before;
import org.junit.Test;
import springfox.documentation.spring.web.plugins.Docket;
import static org.assertj.core.api.Assertions.assertThat;

public class SwaggerConfigurationTest {

    private SwaggerConfiguration swaggerConfiguration;
    @Before
    public void before() {
        swaggerConfiguration = new SwaggerConfiguration();
    }
    @Test
    public void swaggerConfigTest() {
        assertThat(swaggerConfiguration).isNotNull();
        assertThat(swaggerConfiguration.docket()).isNotNull().isInstanceOf(Docket.class);
    }
}
