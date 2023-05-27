package com.fawzySystem.payment_service.payment;//Decorator Class

public abstract class Discount implements Payment {
    Payment payment;
    public Discount(Payment payment){
        this.payment = payment;
    }

    @Override
    public double pay(double amount){
        return this.payment.pay(amount);
    }
}
