package com.fawzySystem.payment_service.payment;

public class CreditCard implements Payment{

    @Override
    public double pay(double amount) {
        return amount + amount*(0.05);
    }
}