package com.maxdjk;

import java.util.Arrays;

public class BankAccount {

    private String typeOfCustomer;
    protected float balance;
    private boolean isPremiumCustomer;
    private final String [] listOfTypesOfCustomers = new String[]{"BASIC", "PREMIUM"}; // Will be either not customer | basic | premium | gold customer


    public BankAccount(CustomerID customer, String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
        setTypeOfCustomer(typeOfCustomer);
    }
    public BankAccount(CustomerID customer) {
        typeOfCustomer = "BASIC";
        setTypeOfCustomer(typeOfCustomer);
    }

    boolean isCustomer(){
        return Arrays.asList(listOfTypesOfCustomers).contains(typeOfCustomer);
    }

    public void upgradeAccount(){
        final float premiumAccountCost = 150;
        if (isCustomer()) {
            if ((balance - premiumAccountCost) > 0) {
                if (isPremiumCustomer)
                    System.out.println("You are already a premium customer");
                else {
                    balance -= premiumAccountCost;
                    setTypeOfCustomer("PREMIUM");
                    System.out.println("Successfully upgraded to Premium CustomerID! €" + premiumAccountCost + " were debit from your balance");
                }
            } else
                System.out.println("Your balance must be superior to €" + (premiumAccountCost + 1 ) + " to upgrade." );
        } else
            System.out.println("Sorry, something went wrong, please contact our services");
    }

    private void setTypeOfCustomer(String customer){
        if (isCustomer())
            if (customer.equalsIgnoreCase("PREMIUM")) {
                isPremiumCustomer = true;
                typeOfCustomer = "PREMIUM";
            }
            else if (customer.equalsIgnoreCase("BASIC")) {
                isPremiumCustomer = false;
                typeOfCustomer = "BASIC";
            }
    }

    public String getTypeOfCustomer(){
        return typeOfCustomer;
    }

    public float getBalance() {
        return balance;
    }

    public boolean isPremiumCustomer() {
        return isPremiumCustomer;
    }

    public String[] getListOfTypesOfCustomers() {
        return listOfTypesOfCustomers;
    }
}


