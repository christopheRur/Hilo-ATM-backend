package com.codelab.HiloATMApp.services;

import org.springframework.stereotype.Service;

@Service
public class HiloServiceImpl implements HiloService{
/**
*
   * @param currentBalance
   * @param spentBalance
   * @return
*/
    @Override
    public double computeBalanceInCheckingAccount(double currentBalance, double spentBalance) {
        return 0;
    }

/**
*
   * @param currentBalance
   * @param withdrawn
   * @return
*/
    @Override
    public double computeBalanceInSavingAccount(double currentBalance, double withdrawn) {
        return 0;
    }
}
