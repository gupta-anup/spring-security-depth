package com.poc.springsecuritydepth.repository;

import com.poc.springsecuritydepth.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}