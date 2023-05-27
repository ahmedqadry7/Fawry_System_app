package com.fawzySystem.payment_service.organzationProviders;

import org.springframework.stereotype.Service;

@Service
public class OrgnaizationFactory implements Ofactory {
    @Override
    public Oragnization getOragnization(String s) {
        switch (s){
            case "school":return new School();
            case "ngos":return new NGOs();
            case "cancer":return new Cancer();

        }
        return null;
    }
}
