package com.company;

public class BankAccount {
    private int account;
    private double balance;
    private String name,email,phone;

    public BankAccount(){
        /// When a new account is created, deposit 5 cents
        this.account = 123345;
        this.name = "default name";
        this.email = "default @email.com";
        this.phone = "default phone";
        this.balance = 0.05;
    }

    public void depositFunds(double deposit){
        if (deposit < 0){
            System.out.println("You cannot deposit a negative amount.");
        } else {
            this.balance = this.balance + deposit;
            System.out.println("Deposit processed. Your new balance is " + this.balance);
        }
    }
    public void withdrawFunds(double withdraw){
        if (withdraw < 0) {
            System.out.println("You cannot withdraw a negative amount");
        } else if (withdraw > this.balance){
            System.out.println("You cannot withdraw " + withdraw + ", only " + this.balance + " available.");
        } else {
            this.balance = this.balance - withdraw;
            System.out.println("Withdrawal processed, your current balance is " + this.balance);
        }
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}


