package com.example.crudapixml.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class CollegeDTO {
    @Id
    @GeneratedValue //id autogenerate
    private Long uuid;
    private String name;
    private int rollNum;
    private String major;
}
