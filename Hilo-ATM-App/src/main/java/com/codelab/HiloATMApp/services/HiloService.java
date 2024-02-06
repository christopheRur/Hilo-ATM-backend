package com.codelab.HiloATMApp.services;

import com.codelab.HiloATMApp.model.Hilo;
import org.springframework.stereotype.Service;

@Service
public interface HiloService {
    public Hilo computeBalanceInCheckingAccount(Hilo hilo);
    public Hilo computeBalanceInSavingAccount(Hilo hilo);

    public double computeDeposited(Hilo hilo);
}
