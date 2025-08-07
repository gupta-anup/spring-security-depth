package com.poc.springsecuritydepth.repository;

import com.poc.springsecuritydepth.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}