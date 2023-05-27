package com.fawzySystem.payment_service.user;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Scanner;

public abstract class User {
    public String username;
    public String email;
    public String password;

    public User(){}


    public User logIn(int n,User a){
        if(n==0){

            for (int i=0;i<Entity.admins.size();i++){
                String s=Entity.admins.get(i).email;
                String p=Entity.admins.get(i).password;
                if(Objects.equals(s, a.email)&&Objects.equals(p,a.password)){
                    return Entity.admins.get(i);
                }
            }
            return null ;
        }else{
            for (int i=0;i<Entity.clients.size();i++){
                String s=Entity.clients.get(i).email;
                String p=Entity.clients.get(i).password;
                if(Objects.equals(s, a.email)&&Objects.equals(p,a.password)){
                    return Entity.clients.get(i);

                }
            }
            return null ;
        }
    }
}
