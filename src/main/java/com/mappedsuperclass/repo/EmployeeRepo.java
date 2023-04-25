package com.mappedsuperclass.repo;

import com.mappedsuperclass.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
