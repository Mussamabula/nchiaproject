package com.benezeth.MockinApp.entity;

import jakarta.persistence.*;

@SuppressWarnings("ALL")
@Entity
@Table(name="segment")
public class Segment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String desciption;

    public Segment(String name,String desciption){
        this.name=name;
        this.desciption=desciption;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }
}
