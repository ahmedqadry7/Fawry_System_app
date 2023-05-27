package com.fawzySystem.payment_service.Sevrvices;
import com.fawzySystem.payment_service.user.Admin;
import com.fawzySystem.payment_service.user.Entity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ServiceController {
    private Tranzaction tranzaction;

    public ServiceController(Tranzaction tranzaction) {
        this.tranzaction = tranzaction;
    }

    @PostMapping(value = "/addService")
    public ResponseEntity<Tranzaction> addService(@RequestBody Tranzaction t){
        Tranzaction tt=tranzaction.addService(t);
        if(t !=null) {
            return ResponseEntity.ok(t);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping(value = "/history")
    public ArrayList<Tranzaction> getTranzaction(){
        return Entity.getTranzactions();
    }
}
