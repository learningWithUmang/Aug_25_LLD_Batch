package adapter;

import adapter.adapters.ICICIBankAdapter;
import adapter.adapters.YESBankAdapter;
import adapter.thirdparty.icicibank.ICICIBankAPI;
import adapter.thirdparty.yesbank.YESBankAPI;

public class PhonePe { //core class of the platform
    /*
    //Tight coupling PhonePe with 3rd party Bank APIs
    private static YESBankAPI api = new YESBankAPI();
    private static ICICIBankAPI iciciApi = new ICICIBankAPI();
     */

    /*
    Loose coupling
     */
    private static  BankAPI api = new ICICIBankAdapter();
    public static void main(String[] args) {
        /*System.out.println(iciciApi.getAccountBalance("1234567890"));
        System.out.println(iciciApi.getTransactionHistory("1234567890"));
        System.out.println(iciciApi.transferFunds("1234567890", "0987654321", 100.0));*/

        System.out.println(api.getTransactionHistory("1234567890"));
        System.out.println(api.transferFunds("1234567890", "0987654321", 100.0));
        System.out.println(api.getAccountDetails("1234567890"));
    }
}

/*
1. Create an interface as per the requirements of the client.
2. For every 3rd party dependency, create an adapter which matches the
above interface requirements with the 3rd party API services.
 */
