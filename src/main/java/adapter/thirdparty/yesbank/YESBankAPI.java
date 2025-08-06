package adapter.thirdparty.yesbank;

public class YESBankAPI {
    public String checkBalance(String accountNumber) {
        // Simulate fetching account balance from ICICI Bank API
        return "YES BANK:- Account Balance for " + accountNumber + ": $1000";
    }

    public String sendMoney(String fromAccount, String toAccount, double amount) {
        // Simulate fund transfer
        return "YES BANK:- Transferred $" + amount + " from " + fromAccount + " to " + toAccount;
    }

    public String txnHistory(String accountNumber) {
        // Simulate fetching transaction history
        return "YES BANK:-Transaction history for " + accountNumber + ": [Transaction1, Transaction2]";
    }
}
