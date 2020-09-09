package com.spring.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = { "classpath:config.properties" })
@Data
public class ConfigHelperDemo {

    @Value("${config.env}")
    private String env;

    @Value("${spring.env}")
    private String environment;

}
