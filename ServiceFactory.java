package com.fawzySystem.payment_service.Sevrvices;

import org.springframework.stereotype.Service;

@Service
public class ServiceFactory implements Ifactory{
    @Override
    public Services GetService(String s) {
        switch (s){
            case "mobile":return new Mobile();
            case "internet":return new Internet();
            case "landline":return new Landline();
            case "donation":return new Donation();
        }
        return null;

    }
}
