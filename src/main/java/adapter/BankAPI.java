package adapter;

public interface BankAPI {
    //PhonePe will list down all functionalities needed by PhonePe
    String getAccountDetails(String accountId); // Method to get account details by account ID
    String transferFunds(String fromAccountId, String toAccountId, double amount); // Method to transfer funds between accounts
    String getTransactionHistory(String accountId); // Method to get transaction history by account ID
}
