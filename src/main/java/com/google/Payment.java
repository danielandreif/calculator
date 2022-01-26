package com.google;

import java.util.Objects;

public class Payment {

    private double amount;
    private String currency;
    private String cardNumber;
    private String customerName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Double.compare(payment.amount, amount) == 0 && currency.equals(payment.currency) && cardNumber.equals(payment.cardNumber) && customerName.equals(payment.customerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency, cardNumber, customerName);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
