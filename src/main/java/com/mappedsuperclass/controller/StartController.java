package com.mappedsuperclass.controller;

import com.mappedsuperclass.entity.Person;
import com.mappedsuperclass.entity.Student;
import com.mappedsuperclass.service.StartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class StartController {

    @Autowired
    private StartService allService;

    @PostMapping("/addPerson")
    public Person addPerson(@RequestBody Person person){
        return allService.addPerson(person);
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return allService.addStudent(student);
    }
}
