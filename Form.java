package com.fawzySystem.payment_service.payment;

public class Form {
    private String id;
    private String username;
    private String ServiceName;
    private double amount;
    private String providerName;
    private String recieptName;

    private String PhoneNumber;
    private String OrgName;

    public String getRecieptName() {
        return recieptName;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setRecieptName(String recieptName) {
        this.recieptName = recieptName;
    }

    public void setId(String id) {
        this.id = id;
    }



    public String getOrgName() {
        return OrgName;
    }

    public void setOrgName(String orgName) {
        OrgName = orgName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public  void display(){
        System.out.println("---------------------------------------");

        System.out.println("Service : " + this.ServiceName);
        //System.out.println("---------------------------------------");

        if (this.id == "1"  )
        {
            System.out.println("Service provider : "+this.providerName);
            System.out.println("Number : "+this.PhoneNumber);
        }
        else if (this.id == "2") {System.out.println("Service provider : "+this.providerName);}

        else if (this.id == "3") {System.out.println("Receipt : "+this.recieptName);}

        else if (this.id == "4") {System.out.println("Organization : "+this.providerName);}
        //System.out.println("---------------------------------------");

        System.out.println("Amount : "+this.amount);
    }
}
