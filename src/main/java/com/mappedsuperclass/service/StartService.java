package com.mappedsuperclass.service;

import com.mappedsuperclass.entity.Person;
import com.mappedsuperclass.entity.Student;
import com.mappedsuperclass.repo.EmployeeRepo;
import com.mappedsuperclass.repo.PersonRepo;
import com.mappedsuperclass.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StartService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private PersonRepo personRepo;

    @Autowired
    private StudentRepo studentRepo;
    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    public Person addPerson(Person person) {
        return personRepo.save(person);
    }
}
