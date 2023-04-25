package com.mappedsuperclass.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student extends Person{
    private String schoolname;
    private int fee;
    private String section;
}
