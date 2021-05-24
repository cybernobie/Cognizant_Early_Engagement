package com.dao;

import com.exception.InvalidFlightException;
import com.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
    List<Customer> customerList = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public Customer viewCustomerByUserName(String userName) {
        try {
            if (customerList.isEmpty()) {
                throw new InvalidFlightException("UserName is invalid");
            } else {
                for (Customer c : customerList) {
                    if (c.getUserName().equals(userName)) {
                        return c;
                    }
                }
            }
        } catch (InvalidFlightException e) {
            System.out.println(e.getMessage());

        }

        return null;
    }

    public boolean validateCustomer(String userName, String password) {
        for (Customer c : customerList) {
            if (c.getUserName().equals(userName) && c.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
