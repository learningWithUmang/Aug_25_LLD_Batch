package adapter.adapters;

import adapter.BankAPI;
import adapter.thirdparty.yesbank.YESBankAPI;

public class YESBankAdapter implements BankAPI {
    // This class implements the BankAPI interface for YES Bank
    // It will use the YESBankAPI to provide the required functionalities

    YESBankAPI yesBankAPI = new YESBankAPI();
    @Override
    public String getAccountDetails(String accountId) {
        return yesBankAPI.checkBalance(accountId);
    }

    @Override
    public String transferFunds(String fromAccountId, String toAccountId, double amount) {
        return yesBankAPI.sendMoney(fromAccountId, toAccountId, amount);
    }

    @Override
    public String getTransactionHistory(String accountId) {
        return yesBankAPI.txnHistory(accountId);
    }
}
