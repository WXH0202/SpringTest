package com.example.test.fieldRetrievingFactoryBean.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FieldRetrievingFactoryBeanEntity {
    public String sex;
    public Integer age;
    public static String name;
}
