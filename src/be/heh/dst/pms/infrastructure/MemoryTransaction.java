package be.heh.dst.pms.infrastructure;
import be.heh.dst.pms.application.service.SaveTransaction;
import java.util.ArrayList;
import java.util.List;

public class MemoryTransaction implements SaveTransaction {

    private List<String> transactionHistory = new ArrayList<String>();

    @Override
    public void save(String transaction) {
        transactionHistory.add(transaction);

        System.out.println(transaction);
        }

    public void displayHistory() {
        System.out.println("Transaction history:");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}
