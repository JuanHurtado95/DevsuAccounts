package com.example.cuentas.domain.report.service;

import com.example.cuentas.domain.report.dto.ReportRequestDTO;
import com.example.cuentas.domain.report.dto.ReportResponseDTO;

public interface IReportService {

    public ReportResponseDTO report(ReportRequestDTO request);
}
