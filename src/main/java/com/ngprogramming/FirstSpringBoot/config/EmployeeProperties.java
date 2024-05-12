package com.ngprogramming.FirstSpringBoot.config;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//to map with Application.properties
@Configuration
//@ConfigurationProperties(prefix = "employee")
@PropertySource(value = "classpath:application.properties")
@Data
public class EmployeeProperties {


//    only use when propertySource annotation is used
    @Value("${employee.name}")
    private String name;
    @Value("${employee.age}")
    private int age;

}
