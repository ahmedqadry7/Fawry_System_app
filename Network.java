package com.fawzySystem.payment_service.networkProviders;

import org.springframework.stereotype.Service;

@Service
public abstract class Network {
    public String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public abstract void networkName() ;
}
