package com.fawzySystem.payment_service.payment;

import com.fawzySystem.payment_service.user.Client;

public class Wallet implements Payment {
     Client ob;
    public Wallet(Client ob) {
        this.ob=ob;
    }

    @Override
    public double pay(double amount) {
        if (ob.walletBalance == 0  || ob.walletBalance < amount)
        {
            System.out.println(" sorry , you dont have enough money in wallet");
            return 0;
        }
        else {
            return amount + amount * (0.01);
        }
    }


}