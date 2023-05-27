package com.fawzySystem.payment_service.payment;

import com.fawzySystem.payment_service.Sevrvices.Tranzaction;
import com.fawzySystem.payment_service.user.Client;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class Refund {

    public static ArrayList<Tranzaction> refunds;
    public Refund(){
        refunds = new ArrayList<Tranzaction>();
    }

    public static ArrayList<Tranzaction> getRefunds() {
        return refunds;
    }

}
