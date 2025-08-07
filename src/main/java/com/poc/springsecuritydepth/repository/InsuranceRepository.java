package com.poc.springsecuritydepth.repository;

import com.poc.springsecuritydepth.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}