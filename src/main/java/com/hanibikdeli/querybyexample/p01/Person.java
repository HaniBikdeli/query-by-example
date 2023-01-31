package com.hanibikdeli.querybyexample.p01;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
    @Id
    private Long id;

    private String name;

    private Long nationalNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNationalNumber() {
        return nationalNumber;
    }

    public void setNationalNumber(Long age) {
        this.nationalNumber = age;
    }

    public Person() {
    }
}
