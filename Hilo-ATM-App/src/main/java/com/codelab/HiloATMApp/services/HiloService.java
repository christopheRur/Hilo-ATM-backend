package com.codelab.HiloATMApp.services;

import org.springframework.stereotype.Service;

@Service
public interface HiloService {
    public double computeBalanceInCheckingAccount(double currentBalance, double spentBalance);
    public double computeBalanceInSavingAccount(double currentBalance, double withdrawn);
}
