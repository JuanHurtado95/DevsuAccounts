package com.example.cuentas.domain.report.dto;

import com.example.cuentas.domain.account.dto.AccountReportDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ReportResponseDTO {

    private String nombre;
    private List<AccountReportDTO> cuentas;
}
