package com.mappedsuperclass.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends Person{
    private int salary;
    private String depname;
    private int bonus;
}
