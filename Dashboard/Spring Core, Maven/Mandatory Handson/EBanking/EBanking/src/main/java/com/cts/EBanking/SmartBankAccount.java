package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.List;

public class SmartBankAccount extends BankAccount {
    public SmartBankAccount(int customerId, String name, double balance, List<String> accounts) {
        super(customerId, name, balance, accounts);
    }

    @Override
    public double calculateFixedAccount(double p, int t) {
        if (p >= 10000 && p <= 1000000 && t > 0 && t <= 120) {
            double r = 10.0;
            double n = 12.0;
            double fixedAccount = p * Math.pow((1.0 + ((r / 100.0) / n)), (n * (t / 12.0)));

            return Double.parseDouble(new DecimalFormat("0.00").format(fixedAccount));
        }

        return -1;
    }

    @Override
    public double calculateRecurringAccount(double p, int n) {
        if (p >= 1000 && p <= 50000 && n > 0 && n <= 60) {
            double r = 7.0;
            double recurringAccount = (p * n) + (p * ((n * (n + 1.0)) / (2.0 * 12.0)) * (r / 100.0));

            return Double.parseDouble(new DecimalFormat("0.00").format(recurringAccount));
        }

        return -1;
    }
}
