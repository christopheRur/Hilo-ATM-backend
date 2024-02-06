package com.codelab.HiloATMApp.model;

import lombok.Data;

@Data
public class Hilo {

    private  Integer id;
    private Double currentBalance;
    private Double savings;
    private Double totalBalance;
    private Double checking;
    private Double currentBalanceSpentFromSavings;
    private Double currentBalanceSpentFromChecking;
    private Double checkingBalance;
    private Double spentBalance;
    private Double depositedCash;




}
