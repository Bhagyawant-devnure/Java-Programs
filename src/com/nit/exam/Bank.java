package com.nit.exam;
class Bank {
    
    private String accountHolderName;
    private int accountNumber;
    private double balance;

     
    public Bank() {
        this.accountHolderName = "Unknown";
        this.accountNumber = 0;
        this.balance = 0.0;
    }

     
    public Bank(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = 0;
        this.balance = 0.0;
    }

     
    public Bank(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        if (balance < 0) {
            System.out.println("Warning: Initial balance cannot be negative. Setting balance to 0.0.");
            this.balance = 0.0;
        } else {
            this.balance = balance;
        }
    }

    
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount. Amount must be greater than 0.");
        } else {
            balance += amount;
            System.out.println("Successfully deposited " + amount + ". New balance: " + balance);
        }
    }

 
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Amount must be greater than 0.");
        } else if (amount > balance) {
            System.out.println("Error Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew " + amount + ". Remaining balance: " + balance);
        }
    }

    
    public void printBalance() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number:" + accountNumber);
        System.out.println("Current Balance:" + balance);
    }
}

































