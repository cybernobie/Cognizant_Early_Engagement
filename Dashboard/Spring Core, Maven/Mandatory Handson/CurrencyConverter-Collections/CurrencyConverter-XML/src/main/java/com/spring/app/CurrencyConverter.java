package com.spring.app;

import java.util.Map;

public class CurrencyConverter {
    private Map<String, String> mObj;

    public Map<String, String> getmObj() {
        return mObj;
    }

    public void setmObj(Map<String, String> mObj) {
        this.mObj = mObj;
    }

    public int getTotalCurrencyValue(String value) {
        char[] chars = value.toCharArray();
        StringBuilder amountStr = new StringBuilder();
        StringBuilder currency = new StringBuilder();

        for (char ch : chars) {
            if (Character.isDigit(ch)) {
                amountStr.append(ch);
            } else {
                currency.append(ch);
            }
        }

        int amount = Integer.parseInt(amountStr.toString());

        return Integer.parseInt(mObj.get(currency.toString().toUpperCase())) * amount;
    }
}
