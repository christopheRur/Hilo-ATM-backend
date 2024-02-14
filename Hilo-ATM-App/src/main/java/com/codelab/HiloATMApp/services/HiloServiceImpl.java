package com.codelab.HiloATMApp.services;

import com.codelab.HiloATMApp.model.Hilo;
import com.codelab.HiloATMApp.repositories.HiloRepo;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class HiloServiceImpl implements HiloService{
    @Autowired
    private final HiloRepo hiloRepo;

    public HiloServiceImpl(HiloRepo hiloRep) {
        this.hiloRepo = hiloRep;
    }


    /**
*
   * @param hilo
   * @return
*/
    @Override
    public Hilo computeBalanceInCheckingAccount(Hilo hilo) {
        double checkingBalance =hilo.getChecking() - hilo.getCurrentBalanceSpentFromChecking();

        hilo.setCheckingBalance(checkingBalance);

        hiloRepo.save(hilo);
        return hilo;
    }

/**
*
   * @param hilo
   * @return
*/
    @Override
    public Hilo computeBalanceInSavingAccount(Hilo hilo) {

        double savingsBalance = hilo.getSavings() - hilo.getCurrentBalanceSpentFromSavings();

        hilo.setSavings(savingsBalance);

        return hilo;
    }

/**
*
   * @param jsonBody
   * @return
*/
    @Override
    public double computeDeposited(JsonObject jsonBody) {

        Hilo hilo =new Hilo();

        double updatedTotalBalance =hilo.getChecking() + hilo.getDepositedCash();

        hilo.setDepositedCash(updatedTotalBalance);
        return updatedTotalBalance;
    }

/**
*
   * @return
*/
    @Override
    public double getTotalSavings(JsonObject jsonBody) {

        return computeDeposited(jsonBody);
    }
}
