package com.fawzySystem.payment_service.payment;

public class Cash implements Payment {
    @Override
    public double pay(double amount) {
        return amount + amount*(0.07);
        //System.out.println();
    }
    
}
