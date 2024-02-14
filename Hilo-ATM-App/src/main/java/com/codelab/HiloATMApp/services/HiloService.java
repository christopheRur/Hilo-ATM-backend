package com.codelab.HiloATMApp.services;

import com.codelab.HiloATMApp.model.Hilo;
import com.google.gson.JsonObject;
import org.springframework.stereotype.Service;

@Service
public interface HiloService {
    public Hilo computeBalanceInCheckingAccount(Hilo hilo);
    public Hilo computeBalanceInSavingAccount(Hilo hilo);

    public double computeDeposited(JsonObject jsonBody);

    public double getTotalSavings(JsonObject jsonBody);
}
