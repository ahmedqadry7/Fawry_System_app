package com.fawzySystem.payment_service.user;

import com.fawzySystem.payment_service.Sevrvices.Tranzaction;
import com.fawzySystem.payment_service.payment.Form;
import com.fawzySystem.payment_service.payment.SpecDiscount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class Client extends User {
    public double walletBalance =0;
    public  ArrayList<Tranzaction> services;
    public Client() {
        this.walletBalance=0;
        services=new ArrayList<Tranzaction>();
    }


    public Client(String e,String p,String u){
        this.email=e;
        this.password=p;
        this.username=u;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance += walletBalance;
    }

    public double getWalletBalance() {
        return walletBalance;
    }


    public String signUp(Client c){
        for (int i=0;i<Entity.clients.size();i++)
        {
            String s=Entity.clients.get(i).email;
            String u=Entity.clients.get(i).username;
            if(Objects.equals(s, c.email) || Objects.equals(u , c.username))
            {
                return  "This email or username is used try new one";
            }
        }
        Entity.clients.add(c);
        return "Add successfully";
    }
    public void  getServices() {
          System.out.print("[ ");
        for (int i = 0 ; i<services.size(); i++) {

            System.out.print((i+1) + " " + services.get(i).getServiceName() + ' ');
            System.out.print(services.get(i).getAmount());
            System.out.print(" , ");
        }
            System.out.println(" ]");
    }



    public int checkDiscounts() {
        boolean flag1 = false, flag2 = false;
        int count = 0;
        if (this.services.isEmpty()) {
            flag1 = true;
        }
        if (SpecDiscount.isvalid) {
            flag2 = true;
        }
        if (flag1 && !flag2) {
            System.out.println("You have Discount For First Service");
            count = 1;
        } else if (!flag1 & flag2) {
            System.out.println("There is Special Discount For Our Service");
            count = 2;
        } else if (flag1 && flag2) {
            System.out.println("You have Discount For First Service And There is Special Discount For Our Service");
            count = 3;
        } else {
            System.out.println("Unfortunately there are no discounts available");
        }

        return count;
    }
}
