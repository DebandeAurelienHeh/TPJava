package be.heh.dst.pms.application.model;

public abstract class PaymentMode {
    private String accountHolder;

    public PaymentMode(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void displayDetails() {
        System.out.println("Account holder: " + accountHolder);
    }

    public abstract void processPayment(double amount);
}
