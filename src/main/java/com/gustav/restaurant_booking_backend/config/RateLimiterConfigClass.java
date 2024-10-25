package com.gustav.restaurant_booking_backend.config;

import io.github.resilience4j.ratelimiter.RateLimiter;
import io.github.resilience4j.ratelimiter.RateLimiterConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class RateLimiterConfigClass {

    @Bean
    public RateLimiter rateLimiter () {
        RateLimiterConfig config = RateLimiterConfig
                .custom()
                .limitForPeriod (10)
                .limitRefreshPeriod (Duration.ofMinutes(1))
                .timeoutDuration (Duration.ofSeconds(1))
                .build();
        return RateLimiter.of("myRateLimiter" , config);
    }

}