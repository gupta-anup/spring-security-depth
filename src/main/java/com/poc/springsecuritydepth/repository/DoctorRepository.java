package com.poc.springsecuritydepth.repository;

import com.poc.springsecuritydepth.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}