package com.example.cuentas.domain.motion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class MotionReportDTO {

    private LocalDate fecha;
    private String tipoMovimiento;
    private double valor;
}

