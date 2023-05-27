package com.fawzySystem.payment_service.user;
import com.fawzySystem.payment_service.Sevrvices.Tranzaction;
import com.fawzySystem.payment_service.payment.Refund;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controller {
    private Client client;
    private User user;
    private RefundRequest refundRequest;

    private Search search ;
    private AddWallet addWallet;
    private AddDiscount addDiscount;

    public Controller(Client client, User user, RefundRequest refundRequest , Search s, AddWallet addWallet, AddDiscount addDiscount) {
        this.client = client ;
        this.user = user ;
        this.refundRequest = refundRequest ;
        this.search = s ;
        this.addWallet = addWallet;
        this.addDiscount=addDiscount;
    }
     @PostMapping(value="/signUp")
    public  String addClient(@RequestBody Client c){
        return client.signUp(c);
    }
    @GetMapping(value = "/clients")
    public ArrayList<Client>getClient(){
        return Entity.getClients();
    }
    @PostMapping(value = "/ClientLogin")
    public ResponseEntity<User> logIn(@RequestBody Client c){
        if(user.logIn(1,c) !=null) {
            return ResponseEntity.ok(user.logIn(1,c));
        }else{
            return ResponseEntity.notFound().build();
        }

    }
    @PostMapping(value = "/AdminLogin")
    public ResponseEntity<User> login(@RequestBody Admin a){
        if(user.logIn(0,a) !=null) {
            return ResponseEntity.ok(user.logIn(0,a));
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping(value = "/Admins")
    public ArrayList<Admin>getAdmin(){
        return Entity.getAdmins();
    }
    @PostMapping(value = "/addRefund")
    public String addRefund(@RequestBody RefundRequest r)
    {
        return refundRequest.addRefundRequest(r);
    }
    @GetMapping(value = "/refunds")
    public ArrayList<Tranzaction>getRefunds(){
        return Refund.getRefunds();
    }

    @GetMapping(value = "/Search")
    public ResponseEntity <ArrayList<String>> Search (@RequestBody Search s ) {return ResponseEntity.ok(search.search(s));}

    @PostMapping(value = "/AddWallet")
    public String addWallet(@RequestBody AddWallet a)
    {
        return addWallet.setWalletBalance(a);
    }

    @PostMapping(value = "/AddDiscount")
    public String addDiscount(@RequestBody AddDiscount a)
    {
        return addDiscount.addDiscount(a);
    }

    @GetMapping(value = "/AddWallets")
    public ArrayList<AddWallet>getWallets(){
        return Entity.getAddWallets();
    }

}
