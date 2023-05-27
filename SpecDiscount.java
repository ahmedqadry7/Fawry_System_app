package com.fawzySystem.payment_service.payment;

public class SpecDiscount extends Discount{
    public static double specialDiscount;
    public static boolean isvalid=false;





    public SpecDiscount(Payment payment) {
        super(payment);
    }



    @Override
    public double pay(double amount){
        return super.pay(amount) - (amount*specialDiscount);
    }
}