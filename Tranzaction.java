package com.fawzySystem.payment_service.Sevrvices;

import com.fawzySystem.payment_service.networkProviders.Network;
import com.fawzySystem.payment_service.networkProviders.NetworkFactory;
import com.fawzySystem.payment_service.organzationProviders.Oragnization;
import com.fawzySystem.payment_service.organzationProviders.OrgnaizationFactory;
import com.fawzySystem.payment_service.payment.*;
import com.fawzySystem.payment_service.recipetProviders.Reciept;
import com.fawzySystem.payment_service.recipetProviders.RecieptFactory;
import com.fawzySystem.payment_service.user.Client;
import com.fawzySystem.payment_service.user.Entity;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class Tranzaction {
    public String serviceName;
    public double amount;
    public String providerName;
    public String email;
    public boolean firstDiscount;
    public boolean specialDiscount;
    public String paymentMethod;

    public Tranzaction(){
        this.firstDiscount=false;
        this.specialDiscount=false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String username;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String password;




    public Tranzaction addService(Tranzaction t) {
        boolean flag=false;
        Client c=new Client();
        for (int i = 0; i< Entity.clients.size(); i++){
            String s=Entity.clients.get(i).email;
            String p=Entity.clients.get(i).password;
            if(Objects.equals(s, t.email)&&Objects.equals(p,t.password)){
                flag=true;
                Entity.clients.get(i).services.add(t);
                c=Entity.clients.get(i);
                break;
            }
        }
        if(flag){
            Entity.tranzactions.add(t);
            ServiceFactory sf = new ServiceFactory();
            Services se = sf.GetService(t.serviceName);
            if(Objects.equals(t.serviceName, "mobile") || Objects.equals(t.serviceName, "internet")){
                NetworkFactory nf = new NetworkFactory();
                Network nk = nf.getNetwork(t.providerName);
            }else if(Objects.equals(t.serviceName, "landline")){
                RecieptFactory rf = new RecieptFactory();
                Reciept r = rf.getReciept(t.providerName);
            }else{
                OrgnaizationFactory of = new OrgnaizationFactory();
                Oragnization o = of.getOragnization(t.providerName);
            }
            if(c.services.size()>1) t.firstDiscount=false;
            if(!SpecDiscount.isvalid) t.specialDiscount=false;
            if(t.firstDiscount && t.specialDiscount ){
                if(Objects.equals(t.paymentMethod, "wallet")){
                    Payment p = new FirstDiscount(new SpecDiscount(new Wallet(c)));
                    t.amount=p.pay(t.amount);
                }else if(Objects.equals(t.paymentMethod, "cash")){
                    Payment p = new FirstDiscount(new SpecDiscount(new Cash()));
                    t.amount=p.pay(t.amount);
                }else{
                    Payment p = new FirstDiscount(new SpecDiscount(new CreditCard()));
                    t.amount=p.pay(t.amount);
                }

            }else if(t.firstDiscount && !t.specialDiscount){
                if(Objects.equals(t.paymentMethod, "wallet")){
                    Payment p = new FirstDiscount(new Wallet(c));
                    t.amount=p.pay(t.amount);
                }else if(Objects.equals(t.paymentMethod, "cash")){
                    Payment p = new FirstDiscount(new Cash());
                    t.amount=p.pay(t.amount);
                }else{
                    Payment p = new FirstDiscount(new CreditCard());
                    t.amount=p.pay(t.amount);
                }
            }else if(!t.firstDiscount && t.specialDiscount){
                if(Objects.equals(t.paymentMethod, "wallet")){
                    Payment p = new SpecDiscount(new Wallet(c));
                    t.amount=p.pay(t.amount);
                }else if(Objects.equals(t.paymentMethod, "cash")){
                    Payment p = new SpecDiscount(new Cash());
                    t.amount=p.pay(t.amount);
                }else{
                    Payment p = new SpecDiscount(new CreditCard());
                    t.amount=p.pay(t.amount);
                }
            }else{
                if(Objects.equals(t.paymentMethod, "wallet")){
                    Payment p = new Wallet(c);
                    t.amount=p.pay(t.amount);
                }else if(Objects.equals(t.paymentMethod, "cash")){
                    Payment p = new Cash();
                    t.amount=p.pay(t.amount);
                }else{
                    Payment p = new CreditCard();
                    t.amount=p.pay(t.amount);
                }
            }
            return t;
        }

        return null;
    }

}
