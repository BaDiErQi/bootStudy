package com.example.bootstudy.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@Component
@ConfigurationProperties(prefix = "properties")
public class PropertyEntity implements Serializable {
    private String name;
    private String age;
}
