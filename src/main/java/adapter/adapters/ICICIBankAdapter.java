package adapter.adapters;

import adapter.BankAPI;
import adapter.thirdparty.icicibank.ICICIBankAPI;

public class ICICIBankAdapter implements BankAPI {
    // This class implements the BankAPI interface for ICICI Bank
    // It will use the ICICIBankAPI to provide the required functionalities
    ICICIBankAPI iciciBankAPI = new ICICIBankAPI();
    @Override
    public String getAccountDetails(String accountId) {
        return iciciBankAPI.knowBalance(accountId);
    }

    @Override
    public String transferFunds(String fromAccountId, String toAccountId, double amount) {
        return iciciBankAPI.transferFunds(fromAccountId, toAccountId, amount);
    }

    @Override
    public String getTransactionHistory(String accountId) {
        return iciciBankAPI.getTransactionHistory(accountId);
    }
}
