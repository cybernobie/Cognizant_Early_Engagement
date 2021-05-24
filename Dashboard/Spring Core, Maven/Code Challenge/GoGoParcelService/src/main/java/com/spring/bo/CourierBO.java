package com.spring.bo;

import java.util.Map;

import com.spring.model.Courier;

public class CourierBO {
	public double calculateCourierCharge(Courier cObj, String city) {
		Map<String, Float> locationServiceCharge = cObj.getServiceCharge().getLocationServiceCharge();
		int weight = cObj.getWeight();
		float chargePerKg = cObj.getChargePerKg();
		double totalCharge = weight * chargePerKg;

		if (locationServiceCharge.containsKey(city)) {
			float charge = locationServiceCharge.get(city);
			totalCharge += charge;
		}

		return totalCharge;
	}
}
