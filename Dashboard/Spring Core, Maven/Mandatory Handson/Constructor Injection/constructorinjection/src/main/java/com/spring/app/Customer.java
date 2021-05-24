package com.spring.app;

public class Customer {
    private int custId;
    private String custName;
    private String emailId;
    private long contactNo;

    public Customer(int custId, String custName, String emailId, long contactNo) {
        this.custId = custId;
        this.custName = custName;
        this.emailId = emailId;
        this.contactNo = contactNo;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", contactNo=" + contactNo +
                '}';
    }
}
