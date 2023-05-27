package com.fawzySystem.payment_service.Sevrvices;

import org.springframework.stereotype.Service;

@Service
public interface Ifactory {
    Services GetService(String s);
}
