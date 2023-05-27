package com.fawzySystem.payment_service.networkProviders;

import org.springframework.stereotype.Service;

@Service
public class Orange extends Network{
    @Override
    public void networkName() {
        System.out.println("------Orange----------");
    }
}
