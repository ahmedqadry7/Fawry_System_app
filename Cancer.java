package com.fawzySystem.payment_service.organzationProviders;

import org.springframework.stereotype.Service;

@Service
public class Cancer extends Oragnization{
    @Override
    public void OragnizationName() {
        System.out.println( "cancer "+getOrgName());
    }
}
