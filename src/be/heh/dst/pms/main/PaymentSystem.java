package be.heh.dst.pms.main;

import be.heh.dst.pms.application.model.*;
import be.heh.dst.pms.application.service.Transaction;
import be.heh.dst.pms.infrastructure.MemoryTransaction;


public class PaymentSystem {
    public static void main(String[] args) {
        PaymentMode bankTransfer = new BankTransferPayment("Aurelien Rousche", "BE68539007547034");
        PaymentMode creditCard = new CreditCardPayment("Yann Motte", "1234 5678 9012 3456");

        MemoryTransaction memoryTransaction = new MemoryTransaction();

        Transaction transactionBank = new Transaction(bankTransfer, memoryTransaction);
        Transaction transactionCredit = new Transaction(creditCard, memoryTransaction);

        transactionBank.makePayment(100);
        memoryTransaction.save("Transaction saved: " + 100 + " euros");

        transactionCredit.makePayment(200);
        memoryTransaction.save("Transaction saved: " + 200 + " euros");

        memoryTransaction.displayHistory();

    }
}
