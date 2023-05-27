package com.fawzySystem.payment_service.user;

import com.fawzySystem.payment_service.Sevrvices.Tranzaction;
import com.fawzySystem.payment_service.payment.Refund;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;
@Service
public class RefundRequest {
    public String email;
    public String password;
    public int id;



    public  String addRefundRequest(RefundRequest r){
            for (int i = 0; i< Entity.clients.size(); i++){
                String s=Entity.clients.get(i).email;
                String p=Entity.clients.get(i).password;
                 if(Objects.equals(s, r.email)&&Objects.equals(p,r.password)){
                      if(Entity.clients.get(i).services.size()>=r.id){
                         Refund.refunds.add(Entity.clients.get(i).services.get(r.id-1));
                          return "Request done";
               }
        }
    }
        return "Failed";

    }

}
