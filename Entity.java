package com.fawzySystem.payment_service.user;

import com.fawzySystem.payment_service.Sevrvices.Tranzaction;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Objects;

@Component
public class Entity {
    public static ArrayList<Client> clients;
    public static ArrayList<Admin> admins;
    public static ArrayList<Tranzaction> tranzactions;
    public static ArrayList<AddWallet> addWallets;

    public Entity() {
        clients = new ArrayList<Client>();
        admins = new ArrayList<Admin>();
        tranzactions=new ArrayList<Tranzaction>();
        addWallets=new ArrayList<AddWallet>();
        Entity.admins.add(new Admin("mohamed", "256", "mohamed"));
        Entity.admins.add(new Admin("ahmed", "256", "Qadri"));
    }

    public static ArrayList<Admin> getAdmins() {
        return admins;
    }

    public static ArrayList<Client> getClients() {
        return clients;
    }

    public static ArrayList<Tranzaction> getTranzactions() {
        return tranzactions;
    }
    public static ArrayList<AddWallet> getAddWallets() {
        return addWallets;
    }


}
