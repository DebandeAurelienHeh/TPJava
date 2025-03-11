package be.heh.dst.pms.application.service;

import be.heh.dst.pms.application.model.PaymentMode;

public class Transaction {
    PaymentMode pm;
    SaveTransaction st;

    public Transaction(PaymentMode pm, SaveTransaction st){
        this.pm = pm;
        this.st = st;
    }
    public void makePayment(double amount){
        pm.processPayment(amount);
        pm.displayDetails();
    }
}
