package adapter.thirdparty.icicibank;

public class ICICIBankAPI {
    public String knowBalance(String accountNumber) {
        // Simulate fetching account balance from ICICI Bank API
        return "ICICI BANK:- Account Balance for " + accountNumber + ": $1000";
    }

    public String transferFunds(String fromAccount, String toAccount, double amount) {
        // Simulate fund transfer
        return "ICICI BANK:- Done $" + amount + " from " + fromAccount + " to " + toAccount;
    }

    public String getTransactionHistory(String accountNumber) {
        // Simulate fetching transaction history
        return "ICICI BANK:-Transaction history for " + accountNumber + ": [Transaction1, Transaction2]";
    }
}
