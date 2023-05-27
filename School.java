package com.fawzySystem.payment_service.organzationProviders;

import org.springframework.stereotype.Service;

@Service
public class School extends Oragnization {
    @Override
    public void OragnizationName() {
        System.out.println("School"+ getOrgName());
    }
}
