package com.example.cuentas.infraestructure.report.controller;

import com.example.cuentas.domain.report.dto.ReportRequestDTO;
import com.example.cuentas.domain.report.dto.ReportResponseDTO;
import com.example.cuentas.domain.report.service.IReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reportes")
public class ReportController {

    @Autowired
    private IReportService reportService;

    @PostMapping
    public ResponseEntity<ReportResponseDTO> generarReporte(@RequestBody ReportRequestDTO request) {
        ReportResponseDTO reporte = reportService.report(request);
        return ResponseEntity.ok(reporte);
    }
}
