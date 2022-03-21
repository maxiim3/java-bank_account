package com.maxdjk;

public class CustomerID {

    private final String customerName;
    private final int customerAge;
    private final String nationality;

    public CustomerID(String Name, int Age, String Nationality) {
        this.customerName = Name;
        this.customerAge = Age;
        nationality = Nationality;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public String getNationality() {
        return nationality;
    }
}
