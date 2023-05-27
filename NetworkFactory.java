package com.fawzySystem.payment_service.networkProviders;

import org.springframework.stereotype.Service;

@Service
public class NetworkFactory implements Nfactory{

    @Override
    public Network getNetwork(String s) {
        switch (s){
            case "we":return new We();
            case "vodafone":return new Vodafone();
            case "etisalat":return new Etisalat();
            case "orange":return new Orange();
        }
        return null;

    }
}

