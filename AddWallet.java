package com.fawzySystem.payment_service.user;

import com.fawzySystem.payment_service.payment.Refund;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Objects;
@Service
public class AddWallet {
    public String email;
    public String password;
    public double balance;
    public String serialNumber;

    public String setWalletBalance(AddWallet addWallet) {
        for (int i = 0; i < Entity.clients.size(); i++) {
            String s = Entity.clients.get(i).email;
            String p = Entity.clients.get(i).password;
            if (Objects.equals(s, addWallet.email) && Objects.equals(p, addWallet.password)) {
                Entity.clients.get(i).setWalletBalance(addWallet.balance);
                Entity.addWallets.add(addWallet);
                return "Request done";
            }
        }
        return "Failed";
    }

}
