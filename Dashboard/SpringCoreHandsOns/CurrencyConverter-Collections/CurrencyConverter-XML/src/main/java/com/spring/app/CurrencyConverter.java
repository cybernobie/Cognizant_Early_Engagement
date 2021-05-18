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
		for (Map.Entry<String, String> entry : mObj.entrySet()) {
			String currencyName = entry.getKey();
			String uppercaseValue = value.toUpperCase();

			if (uppercaseValue.contains(currencyName)) {
				int conversionRate = Integer.parseInt(entry.getValue());
				int totalCurrency = Integer.parseInt(uppercaseValue.substring(0, uppercaseValue.indexOf(currencyName)));
				return totalCurrency * conversionRate;
			}
		}
		return 0;
	}

}