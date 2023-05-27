package com.fawzySystem.payment_service.user;

import com.fawzySystem.payment_service.payment.SpecDiscount;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AddDiscount {
    public String email;
    public String password;
    public double percentage;




    public String addDiscount(AddDiscount a){
        for (int i=0;i<Entity.admins.size();i++){
            String s=Entity.admins.get(i).email;
            String p=Entity.admins.get(i).password;
            if(Objects.equals(s, a.email)&&Objects.equals(p,a.password)){
                SpecDiscount.specialDiscount=1/a.percentage;
                SpecDiscount.isvalid=true;
                return "Your Request Completed";
            }
        }
        return "Failed";

    }
}
