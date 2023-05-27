package com.fawzySystem.payment_service.recipetProviders;

import org.springframework.stereotype.Service;

@Service
public class Monthly extends Reciept{
    @Override
    public void recieptName() {
        System.out.println("----------Monthly------------");
    }
}
