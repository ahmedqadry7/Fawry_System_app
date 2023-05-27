package com.fawzySystem.payment_service.recipetProviders;

import org.springframework.stereotype.Service;

@Service
public abstract class Reciept {
    public String recName;

    public String getRecName() {
        return recName;
    }

    public void setRecName(String recName) {
        this.recName = recName;
    }

    public abstract void recieptName();
}
