package com.devcloudis.blog.configuration;

import no.finn.unleash.DefaultUnleash;
import no.finn.unleash.Unleash;
import no.finn.unleash.util.UnleashConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeatureToggleConfig {

    @Bean
    public UnleashConfig unleashConfig() {
        return UnleashConfig.builder()
                .appName("java-test")
                .instanceId("blog")
                .unleashAPI("http://localhost:4242/api/")
                .synchronousFetchOnInitialisation(true)
                .build();

    }

    @Bean
    public Unleash unleash() {
        return new DefaultUnleash(unleashConfig());
    }
}
