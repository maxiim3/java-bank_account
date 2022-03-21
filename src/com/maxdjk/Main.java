package com.maxdjk;


public class Main {

    public static void main(String[] args) {
	// write your code here

        var maxime = new CustomerID("maxime", 33, "Fr");
        var n26 = new BankAccount(maxime);
        var N26_maxime = new BankOperation(n26);

        N26_maxime.deposit(500);
        n26.upgradeAccount();
        N26_maxime.withdrawal(50);
        System.out.println(n26.getBalance());
        N26_maxime.withdrawal(500);
        System.out.println(n26.getBalance());


    }


    }

