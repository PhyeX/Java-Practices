import java.sql.SQLOutput;

public abstract class Account implements IBaseRate {
   //List common properties for saving and checking accounts
    private String name;
    private String sSN;
    private double balance;
    private static int index =10000;
    protected String accountNumber;
    protected double rate;
    //Constructor to set base properties and initilaize the account
     public Account(String name,String sSN,double initDeposit){
    this.name=name;
    this.sSN =sSN;
    balance = initDeposit;
         // Set account number
         index++;
         this.accountNumber=setAccountNumber();

         setRate();
     }
     private String setAccountNumber(){
         String lastTwoOfSSN = sSN.substring(sSN.length()-2,sSN.length());
         int randomNumber= (int)(Math.random()*Math.pow(10,3));
         return lastTwoOfSSN + index+ + randomNumber;
     }
    public abstract void setRate();
    // List the common methods - transactions
     public void deposit(double amount){
       balance = balance + amount;
         System.out.println("Depositing $"+ amount);
         printBalance();
     }
     public void withdraw(double amount){
       balance = balance - amount;
         System.out.println("Withdrawing $"+amount);
         printBalance();
     }
     public void transfer(String toWhere,double amount){
       balance = balance - amount;
         System.out.println("Transfering $" + amount + " to " + toWhere);
         printBalance();
     }
     public void printBalance(){
         System.out.println("Your balance is now:  $" + balance);
     }

     public void compound(){
         double accruedInterest = balance * (rate/100);
         balance = balance + accruedInterest;
         System.out.println("Accured Interest: $"+ accruedInterest);
         printBalance();
     }
    public void showInfo(){
        System.out.println(
                "Name: "+name+
                "\nAccount Number: " + accountNumber +
                "\nBalance: " + balance +
                "\nRate: "+ rate + "%"
        );
    }
}
