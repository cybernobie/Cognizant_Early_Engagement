package com.cts.rainbowjewellers.service;

public class RainbowJewellersService {
    
	private final double ratepergram = 4450.00;
	private double makingcharges;
	private double gst;
	private double totalprice;

	public double calculategoldprice(double gram) {
		double totalpriceofgold = 0.0d;
		totalprice = gram * ratepergram;
		makingcharges = (totalprice * 10) / 100;
		gst = (totalprice + makingcharges) * 3 / 100;
		totalpriceofgold = totalprice + makingcharges + gst;
		return totalpriceofgold;
	}

	public static void main(String args[]){
		System.out.println(new RainbowJewellersService().calculategoldprice(20));
	}
}


