package com.fawzySystem.payment_service.organzationProviders;

import org.springframework.stereotype.Service;

@Service
public class NGOs extends Oragnization{
    @Override
    public void OragnizationName() {
        System.out.println(getOrgName());
    }
}
