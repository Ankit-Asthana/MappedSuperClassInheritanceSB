package com.mappedsuperclass.repo;

import com.mappedsuperclass.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
