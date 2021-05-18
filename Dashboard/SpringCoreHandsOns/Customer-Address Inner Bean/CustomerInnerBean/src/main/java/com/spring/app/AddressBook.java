package com.spring.app;

public class AddressBook {
	private String phoneNumber;
	private Address tempAddress;
	
	// Single-parameter constructor specifically for injecting 'tempAddress'
	// through constructor-based injection
	public AddressBook(Address tempAddress) {
		this.tempAddress = tempAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getTempAddress() {
		return tempAddress;
	}

	public void setTempAddress(Address tempAddress) {
		this.tempAddress = tempAddress;
	}
}
