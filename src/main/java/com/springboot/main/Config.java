package com.springboot.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value="classpath:hubble-config.properties")
public class Config {
    @Value("${HubbleGroup}")
    public String HubbleGroup;

    @Value("${port}")
    public String port;
}
