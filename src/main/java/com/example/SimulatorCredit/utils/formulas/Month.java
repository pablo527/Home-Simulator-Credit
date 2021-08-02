package com.example.SimulatorCredit.utils.formulas;

public class Month {
    private double rent;
    private double interest;
    private double amortization;
    private double balance;

    public Month(double rent, double interest, double amortization, double balance) {
        this.rent = rent;
        this.interest = interest;
        this.amortization = amortization;
        this.balance = balance;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getAmortization() {
        return amortization;
    }

    public void setAmortization(double amortization) {
        this.amortization = amortization;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
