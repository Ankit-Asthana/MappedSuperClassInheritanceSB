package com.mappedsuperclass.repo;

import com.mappedsuperclass.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person,Integer> {
}
