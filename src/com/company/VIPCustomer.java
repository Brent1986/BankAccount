package com.company;

public class VIPCustomer {
    /// Fields

    private String name,email;
    private double creditLimit;

    ///Getters

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public double getCreditLimit() {
        return creditLimit;
    }

    /// Constructors with default values
    public VIPCustomer(){
        this("default name","default email",15000);
        System.out.println("Empty constructor.");
    }
    public VIPCustomer(String name, String email){
        this(name,email,1500);
        System.out.println("Constructor with 2 parameters");
    }
    public VIPCustomer(String name, String email, double creditLimit){
        System.out.println("Constructor with 3 parameters");
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }
}
