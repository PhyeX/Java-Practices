import sun.plugin.dom.css.CSSValueList;

import javax.swing.text.Utilities;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<Account>();
        //Read a CSV File then create new account based on that data
        List<String[]> newAccounteHolder = CSV.read("C:\\Users\\Tayyip\\Desktop\\NewBankAccounts.csv");
        for(String[] s: newAccounteHolder){
            String name = s[0];
            String sSN = s[1];
            String accountType = s[2];
            double initDeposit = Double.valueOf(s[3]);
            //System.out.println(name + " " + sSN + " "+ accountType + " $" + initDeposit);
            if(accountType.equals("Savings")){
                accounts.add(new Savings (name,sSN,initDeposit));
            }
            else if(accountType.equals("Checking")) {
                accounts.add(new Checking (name,sSN,initDeposit));
            }
            else{
                System.out.println("Error reading account type");
            }
        }
        for(Account acc: accounts){
            acc.showInfo();
            System.out.println("*****************");
        }
    }
}
