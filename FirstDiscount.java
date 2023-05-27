package com.fawzySystem.payment_service.payment;

public class FirstDiscount extends Discount{

    public FirstDiscount(Payment payment) {
        super(payment);
    }

    @Override
    public double pay(double amount){
        return super.pay(amount) - (amount*0.1);
    }
}