package com.company;

public class VipCustomers {
    private String name;
    private String emailAddress;
    private double creditLimit;

    public VipCustomers(){
        this("Unknown","Unknown@Unknown.com",0.00);
    }

    public VipCustomers(String name,String emailAddress){
        this(name,emailAddress,0.00);
    }

    public VipCustomers(String name,String emailAddress,double creditLimit){
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }


}
