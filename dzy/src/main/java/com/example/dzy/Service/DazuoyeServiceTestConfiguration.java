package com.example.dzy.Service;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class DazuoyeServiceTestConfiguration {
    @Bean
    @Primary
    public DazuoyeService dazuoyeServiceTest() {
        return Mockito.mock(DazuoyeService.class);
    }
}
