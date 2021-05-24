package com.spring.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bo.CourierBO;
import com.spring.exception.InvalidParcelWeightException;
import com.spring.model.Courier;

public class CourierService {
	private CourierBO cBoObj;

	public CourierBO getcBoObj() {
		return cBoObj;
	}

	public void setcBoObj(CourierBO cBoObj) {
		this.cBoObj = cBoObj;
	}

	public double calculateCourierCharge(int courierId, int weight, String city) throws InvalidParcelWeightException {
		double totalCharge = 0.0;
		
		if (weight > 0 && weight < 1000) {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

			Courier courier = context.getBean("courier", Courier.class);
			courier.setCourierId(courierId);
			courier.setWeight(weight);

			context.close();

			totalCharge = cBoObj.calculateCourierCharge(courier, city);
		} else {
			throw new InvalidParcelWeightException("Invalid Parcel Weight");
		}
		
		return totalCharge;
	}
}
