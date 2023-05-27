package com.fawzySystem.payment_service.Sevrvices;

import org.springframework.stereotype.Service;

@Service
public class Donation implements Services{

    @Override
    public void serviceName() {
        System.out.println("Welcome to Donation Service");
    }
}
