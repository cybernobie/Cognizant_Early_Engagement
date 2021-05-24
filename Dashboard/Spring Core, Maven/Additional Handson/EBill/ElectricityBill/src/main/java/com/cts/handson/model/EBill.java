package com.cts.handson.model;

import com.cts.handson.util.DateUtil;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ebill")
public class EBill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bill_number")
    private long billNumber;
    @Column(name = "consumer_id")
    private String consumerId;
    @Column(name = "billing_month")
    private Date billingMonth;
    @Column(name = "reading")
    private long reading;
    @Column(name = "unit")
    private long unit;
    @Column(name = "amount")
    private double amount;

    public EBill() {
    }

    public EBill(long billNumber, String consumerId, Date billingMonth, long reading, long unit, double amount) {
        this.billNumber = billNumber;
        this.consumerId = consumerId;
        this.billingMonth = billingMonth;
        this.reading = reading;
        this.unit = unit;
        this.amount = amount;
    }

    public long getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(long billNumber) {
        this.billNumber = billNumber;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(String consumerId) {
        this.consumerId = consumerId;
    }

    public Date getBillingMonth() {
        return billingMonth;
    }

    public void setBillingMonth(Date billingMonth) {
        this.billingMonth = billingMonth;
    }

    public long getReading() {
        return reading;
    }

    public void setReading(long reading) {
        this.reading = reading;
    }

    public long getUnit() {
        return unit;
    }

    public void setUnit(long unit) {
        this.unit = unit;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format(
                "%-5s %-15s %-10s %10s %5s %.2f",
                billNumber,
                consumerId,
                DateUtil.dateToString(billingMonth),
                reading,
                unit,
                amount
        );
    }
}
