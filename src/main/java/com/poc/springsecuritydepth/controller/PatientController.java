package com.poc.springsecuritydepth.controller;

import com.poc.springsecuritydepth.dto.AppointmentResponseDto;
import com.poc.springsecuritydepth.dto.CreateAppointmentRequestDto;
import com.poc.springsecuritydepth.dto.PatientResponseDto;
import com.poc.springsecuritydepth.service.AppointmentService;
import com.poc.springsecuritydepth.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {

    private final PatientService patientService;
    private final AppointmentService appointmentService;

    @PostMapping("/appointments")
    public ResponseEntity<AppointmentResponseDto> createNewAppointment(@RequestBody CreateAppointmentRequestDto createAppointmentRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(appointmentService.createNewAppointment(createAppointmentRequestDto));
    }

    @GetMapping("/profile")
    private ResponseEntity<PatientResponseDto> getPatientProfile() {
        Long patientId = 4L;
        return ResponseEntity.ok(patientService.getPatientById(patientId));
    }

}
