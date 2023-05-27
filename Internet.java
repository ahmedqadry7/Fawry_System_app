package com.fawzySystem.payment_service.Sevrvices;

import org.springframework.stereotype.Service;

@Service
public class Internet implements Services {

    @Override
    public void serviceName() {
        System.out.println("Welcome to Internet Service");
    }
}
