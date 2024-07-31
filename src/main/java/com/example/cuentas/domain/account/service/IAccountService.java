package com.example.cuentas.domain.account.service;

import com.example.cuentas.domain.account.entity.AccountEntity;
import com.example.cuentas.domain.motion.dto.MotionDTO;
import com.example.cuentas.domain.motion.entity.MotionEntity;

import java.util.List;
import java.util.Optional;

public interface IAccountService {

    List<AccountEntity> getAllAccounts();

    Optional<AccountEntity> getAccountByNumber(Long numeroCuenta);

    AccountEntity createAccount(AccountEntity cuentaEntity);

    AccountEntity updateAccount(Long numeroCuenta, AccountEntity cuentaEntity);

    void deleteCuenta(Long numeroCuenta);

    AccountEntity actualizarSaldo(MotionDTO movimiento);
}
