package com.fawzySystem.payment_service.organzationProviders;

import org.springframework.stereotype.Service;

@Service
public abstract class Oragnization {
    public String orgName;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public abstract void OragnizationName() ;
}
