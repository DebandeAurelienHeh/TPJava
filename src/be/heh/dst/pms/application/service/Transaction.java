package be.heh.dst.pms.application.service;

import be.heh.dst.pms.application.model.PaymentMode;

public class Transaction {
    PaymentMode pm;
    public Transaction(PaymentMode pm){
        this.pm = pm;
    }
    public void makePayment(double amount){
        pm.processPayment(amount);
        pm.displayDetails();
    }
}
