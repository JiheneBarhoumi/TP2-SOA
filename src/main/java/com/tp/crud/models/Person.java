package com.tp.crud.models;

import javax.persistence.*;


@Entity
@Table
public class Person {

    //Attributes
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String name;
    private String famName;
    private String email;

    //Constructors
    public Person(long id, String name, String famName, String email) {
        this.id = id;
        this.name = name;
        this.famName = famName;
        this.email=email;
    }

    public Person() {
    }

    public Person(Person person) {
        this.id= person.getId();
        this.name=person.getName();
        this.famName=person.getFamName();
        this.email= person.getEmail();
    }

    //getters and setters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFamName() {
        return famName;
    }

    public String getEmail() {
        return email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamName(String famName) {
        this.famName = famName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
