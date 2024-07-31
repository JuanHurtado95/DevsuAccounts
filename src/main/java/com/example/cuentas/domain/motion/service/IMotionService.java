package com.example.cuentas.domain.motion.service;

import com.example.cuentas.domain.common.exception.SaldoInsuficienteException;
import com.example.cuentas.domain.motion.dto.MotionDTO;
import com.example.cuentas.domain.motion.entity.MotionEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface IMotionService {

    public List<MotionEntity> getAllMotions();

    public Optional<MotionEntity> getMotionById(Long id);

    public MotionEntity createMotion(MotionDTO motion);

    public MotionEntity updateMotion(Long id, MotionEntity motionDetails);

    public void deleteMotion(Long id);
}
