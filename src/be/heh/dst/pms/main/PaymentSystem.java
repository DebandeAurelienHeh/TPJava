package be.heh.dst.pms.main;

import be.heh.dst.pms.application.model.*;
import be.heh.dst.pms.application.service.Transaction;


public class PaymentSystem {
    public static void main(String[] args) {
        PaymentMode bankTransfer = new BankTransferPayment("Aurelien Rousche", "BE68539007547034");
        PaymentMode creditCard = new CreditCardPayment("Yann Motte", "1234 5678 9012 3456");

        Transaction transactionBank = new Transaction(bankTransfer);
        Transaction transactionCredit = new Transaction(creditCard);

        transactionBank.makePayment(100);
        transactionCredit.makePayment(200);
    }
}
