package com.soft.myapp;

public class UserAccount {
    public String userName;
    public String accountNumber;
    public double accountBalance;
    public boolean accountStatus;

    public UserAccount () {}

    public UserAccount (String userName, String accountNumber, double accountBalance, boolean accountStatus) {
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountStatus = accountStatus;
    }


}
