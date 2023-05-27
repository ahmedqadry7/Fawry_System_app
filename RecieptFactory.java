package com.fawzySystem.payment_service.recipetProviders;

import org.springframework.stereotype.Service;

@Service
public class RecieptFactory implements Rfactory {
    @Override
    public Reciept getReciept(String s) {
        switch (s){
            case "monthly":return new Monthly();
            case "quarter":return new Quarter();
        }
        return null;
    }
}
