package com.fawzySystem.payment_service.networkProviders;

import org.springframework.stereotype.Service;

@Service
public interface Nfactory {
    public Network getNetwork(String s);
}
