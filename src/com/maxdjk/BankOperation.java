package com.maxdjk;

public class BankOperation {
    private BankAccount account;
    private float amount;


    public BankOperation(BankAccount account) {
        this.account = account;
    }

    public void connect(){
        if (account.isCustomer()) {
        } else
            System.out.println("Sorry, something went wrong, please contact our services");

    }

    private void validateOperation(float amount , float limit, float condition, String typeOfOperation, String message) {
        if (condition >= limit) {
            setBalance();
            System.out.println("Successfully" + typeOfOperation + "€" + amount + " from your balance");
        } else
            System.out.println(message);
    }

    private void validateOperation(float amount , String typeOfOperation) {
            setBalance();
            System.out.println("Successfully" + typeOfOperation + "€" + amount + " from your balance");
    }



    public void withdrawal(float amount){
            if ((account.getBalance() - amount) < 0) {
                if (account.isPremiumCustomer())
                    validateOperation((-amount), -500, (account.getBalance() - amount) ,"withdrawal", "Your account cannot be debtor less than €500");
                else
                    System.out.println(account.getTypeOfCustomer() + " customers cannot be debtor");
            } else {
                validateOperation((-amount), "withdrawal");
                }
    }


    public void deposit(float amount){
            if (amount > 1500) {
                if (account.isPremiumCustomer()) {
                   validateOperation(amount, "deposit");
                } else
                    System.out.println("Maximum deposit is €1500 for " + account.getTypeOfCustomer() + " customers.");
            } else {
                setBalance();
                System.out.println("Successfully added €" + amount + " to your balance");
                }
    }



    private void setBalance() {
        account.balance = account.getBalance() + amount;
    }

    public void balance(){
        float balance = account.getBalance();
        if (account.isCustomer())
            System.out.println("Your balance is €" + balance);
        else
            System.out.println("You are not a customer, sorry");
    }
}
