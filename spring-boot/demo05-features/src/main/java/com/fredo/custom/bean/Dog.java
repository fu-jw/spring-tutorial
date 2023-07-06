package com.fredo.custom.bean;

import lombok.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Data
@Component
@Profile({"test"})
public class Dog {
    private long id;
    private String name;
    private int age;
}
