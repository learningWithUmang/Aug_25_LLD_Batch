package adapter;

import adapter.adapters.ICICIBankAdapter;
import adapter.adapters.YESBankAdapter;

public class BankAdaptersFactory {
    BankAPI getBankAdapterFactory(String bankName) {
        // This method will return the appropriate BankAPI adapter based on the bank name
        switch (bankName.toLowerCase()) {
            case "icici":
                return new ICICIBankAdapter();
            case "sbi":
                return new YESBankAdapter();
            default:
                throw new IllegalArgumentException("Unsupported bank: " + bankName);
        }
    }
}
