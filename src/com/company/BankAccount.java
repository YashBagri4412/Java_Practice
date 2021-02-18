package com.company;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        this(00001,0.00,"unKnown","unKnown@unknown.com",999999);
        System.out.println("Empty Constructor is Called");
    }

    public BankAccount(int accountNumber,double balance,String customerName,String email,int phoneNumber){
        System.out.println("The constructor with parameter is called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit){
        balance += deposit;
    }

    public void withdrawFund(double amount){
        if(balance < amount){
            System.out.println("Amount insufficient");
        }else{
            System.out.println("Amount deducted");
            balance -= amount;
        }

    }
}
